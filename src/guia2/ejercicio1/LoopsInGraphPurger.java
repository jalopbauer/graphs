package graphs.guia2.ejercico1;

import graphs.Graph;

public class LoopsInGraphPurger {
    public void purge(Graph<String> graph) {
        for (int i = 0; i < graph.order(); i++) {
            if (graph.existsEdge(i,i)) graph.deleteEdge(i,i);
        }
    }
}
