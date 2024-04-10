package HDT8;

import java.util.*;

public class VectorHeap<E extends Comparable<E>> implements Queue<E> {
    private PriorityQueue<E> heap;

    public VectorHeap() {
        heap = new PriorityQueue<>();
    }

    @Override
    public boolean add(E e) {
        return heap.add(e);
    }

    @Override
    public E remove() {
        return heap.remove();
    }

    @Override
    public E poll() {
        return heap.poll();
    }

    @Override
    public E element() {
        return heap.element();
    }

    @Override
    public E peek() {
        return heap.peek();
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return heap.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return heap.iterator();
    }

    @Override
    public Object[] toArray() {
        return heap.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return heap.toArray(a);
    }

    @Override
    public boolean remove(Object o) {
        return heap.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return heap.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return heap.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return heap.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return heap.retainAll(c);
    }

    @Override
    public void clear() {
        heap.clear();
    }

    @Override
    public boolean offer(E e) {
        return heap.offer(e);
    }
}
