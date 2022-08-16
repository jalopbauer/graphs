package guia2;

import graphs.Graph;

public class StringEdges {

    public String stringEdges(Graph graph){
        String edges = "";
        for (int i = 0; i < graph.order(); i++) {
            for (int j = i; j < graph.order(); j++) {
                if (graph.existsEdge(i,j)) edges += "{" + graph.getVertex(i).toString() + "," + graph.getVertex(j).toString() + "}";
            }
        }
        return "{" + edges + "}";
    }
}
