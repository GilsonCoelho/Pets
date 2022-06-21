package com.gsc.pets.utis;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
public class PetsUtil {
    public static List<Integer> calcularIdade(Date data) {
        int anos = 0;
        int meses = 0;
        int dias = 0;

        Calendar dataAtual;
        Calendar dataNascimento;

        dataAtual = Calendar.getInstance();
        dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(data);

        anos = anos + (dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR));

        meses = meses + (dataAtual.get(Calendar.MONTH) - dataNascimento.get(Calendar.MONTH));

        dias = dias + (dataAtual.get(Calendar.DAY_OF_MONTH) - dataNascimento.get(Calendar.DAY_OF_MONTH));

        if (dataAtual.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)) {
            if (dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                dias = 30 + dias;
                meses = 12 + meses;
                anos = anos - 1;
            }
        } else if (dataAtual.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
            if (dataAtual.get(Calendar.DAY_OF_MONTH) >= dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                meses = 12 + meses;
                anos = anos - 1;
            } else if (dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                dias = 30 + dias;
                meses = 12 + meses;
                anos = anos - 1;
            }
        } else if (dataAtual.get(Calendar.MONTH) > dataNascimento.get(Calendar.MONTH)) {
            if (dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
                dias = 30 + dias;
                meses = meses - 1;
            }
        }
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(anos);
        lista.add(meses);
        lista.add(dias);
        return  lista;
    }
}
