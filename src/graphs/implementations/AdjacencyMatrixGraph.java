package graphs.implementations;

import graphs.Graph;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixGraph<T> implements Graph<T> {

    private int alpha, n;
    private boolean A[][];
    private List<T> V;

    public AdjacencyMatrixGraph(int initialSize) {
        this.alpha = 0;
        this.n = 0;
        this.A = new boolean[initialSize][initialSize];
        this.V = new ArrayList<>(initialSize);
    }

    public AdjacencyMatrixGraph() {
        this.alpha = 0;
        this.n = 0;
        this.A = new boolean[69][69];
        this.V = new ArrayList<>(69);
    }

    @Override
    public void addVertex(T x) {
        V.add(n, x);
        V.set(n, x);
        n++;
    }

    @Override
    public void addEdge(int v, int w) {
        if (n < v || n < w || V.get(v) == null || V.get(w) == null) return;
        alpha++;
        A[v][w] = true;
        A[w][v] = true;
    }

    @Override
    public void deleteEdge(int v, int w) {
        if (n < v || n < w || V.get(v) == null || V.get(w) == null) return;
        alpha--;
        A[v][w] = false;
        A[w][v] = false;
    }

    @Override
    public void deleteVertex(int v) {
        if (n < v || V.get(v) == null) return;
        deleteAmountOfEdges(v);
        overwriteEdges(v);
        overwriteVertex(v);
        n--;
    }

    private void deleteAmountOfEdges(int v) {
        for (int i = 0; i < n; i++) {
            if (A[v][i]) alpha--;
        }
    }

    private void overwriteVertex(int v) {
        for (int i = v; i < n-1; i++) {
            V.set(i, V.get(i+1));
        }
    }

    private void overwriteEdges(int v) {
        for (int i = v; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = A[i+1][j];
                A[j][i] = A[j][i+1];
            }
        }
    }


    @Override
    public boolean existsEdge(int v, int w) {
        return A[v][w];
    }

    @Override
    public int order() {
        return n;
    }

    @Override
    public int edgeQuantity() {
        return alpha;
    }

    @Override
    public T getVertex(int v) {
        return V.get(v);
    }

    @Override
    public List<Integer> getAdyList(int v) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            if (A[v][i]) list.add(i);
        }
        return list;
    }

    @Override
    public int getIndex(T x) {
        for (int i = 0; i < V.size(); i++) {
            if(V.get(i).equals(x)) return i;
        }
        return -1;
    }
}
