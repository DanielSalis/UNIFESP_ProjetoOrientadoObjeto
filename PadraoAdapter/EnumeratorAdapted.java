package PadraoAdapter;

import java.util.Iterator;
import java.util.Objects;
import java.util.Enumeration;

class EnumeratorAdapted<T> implements Iterator<T> {
    Enumeration<T> source;

    EnumeratorAdapted(Enumeration<T> source) {
        this.source = Objects.requireNonNull(source);
    }

    @Override
    public boolean hasNext() {
        return this.source.hasMoreElements();
    }

    @Override
    public T next() {
        return this.source.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Não é possível remover");
    }

}