package graphs;

import java.util.List;

public interface Graph<T> {
    void addVertex(T x);
    void addEdge(int v, int w);
    void deleteEdge(int v, int w);
    void deleteVertex(int v);
    boolean existsEdge(int v, int w);
    int order();
    int edgeQuantity();
    T getVertex(int v);
    List<Integer> getAdyList(int v);
    int getIndex(T x);
}
