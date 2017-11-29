package it.dsgroup.restapplication;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by utente9.academy on 28/11/2017.
 */

public class Azienda implements Serializable{

    public List<Dipendente> getDipendenti() {
        return dipendenti;
    }

    public void setDipendenti(List<Dipendente> dipendenti) {
        this.dipendenti = dipendenti;
    }

    List<Dipendente> dipendenti ;

    public Azienda() {
        dipendenti = new List<Dipendente>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NonNull
            @Override
            public Iterator<Dipendente> iterator() {
                return null;
            }

            @NonNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NonNull
            @Override
            public <T> T[] toArray(@NonNull T[] a) {
                return null;
            }

            @Override
            public boolean add(Dipendente dipendente) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(@NonNull Collection<? extends Dipendente> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, @NonNull Collection<? extends Dipendente> c) {
                return false;
            }

            @Override
            public boolean removeAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(@NonNull Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Dipendente get(int index) {
                return null;
            }

            @Override
            public Dipendente set(int index, Dipendente element) {
                return null;
            }

            @Override
            public void add(int index, Dipendente element) {

            }

            @Override
            public Dipendente remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NonNull
            @Override
            public ListIterator<Dipendente> listIterator() {
                return null;
            }

            @NonNull
            @Override
            public ListIterator<Dipendente> listIterator(int index) {
                return null;
            }

            @NonNull
            @Override
            public List<Dipendente> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
}
