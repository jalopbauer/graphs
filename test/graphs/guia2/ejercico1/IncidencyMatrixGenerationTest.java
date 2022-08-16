package graphs.guia2.ejercico1;

import graphs.Graph;
import graphs.implementations.AdjacencyMatrixGraph;
import guia2.ejercicio1.AdyacencyMatrixGeneration;
import org.junit.Test;

import static org.junit.Assert.*;

public class IncidencyMatrixGenerationTest {

    AdyacencyMatrixGeneration adyacencyMatrixGeneration = new AdyacencyMatrixGeneration();

    @Test
    public void testEmptyGraphSizeCero() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        boolean[][] adyacencyMatrix = adyacencyMatrixGeneration.generate(graph);
        assertEquals(0,adyacencyMatrix.length);
    }
    @Test
    public void testSingleVertexGraphSizeIsOne() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Noice");
        boolean[][] adyacencyMatrix = adyacencyMatrixGeneration.generate(graph);
        assertEquals(1,adyacencyMatrix.length);
    }

    @Test
    public void testSingleVertexGraphNoEdgesIsAllFalse() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Noice");
        boolean[][] adyacencyMatrix = adyacencyMatrixGeneration.generate(graph);
        assertFalse(adyacencyMatrix[0][0]);
    }

    @Test
    public void testSingleVertexGraphWithEdgesIsAllTrue() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Noice");
        graph.addEdge(0,0);
        boolean[][] adyacencyMatrix = adyacencyMatrixGeneration.generate(graph);
        assertTrue(adyacencyMatrix[0][0]);
    }

    @Test
    public void testDoubleVertexGraphSizeIswo() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Noice");
        graph.addVertex("69");
        boolean[][] adyacencyMatrix = adyacencyMatrixGeneration.generate(graph);
        assertEquals(2,adyacencyMatrix.length);
    }

    @Test
    public void testDoubleVertexGraphWithEdgesIsAllTrue() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Noice");
        graph.addVertex("69");
        graph.addEdge(0,1);
        boolean[][] adyacencyMatrix = adyacencyMatrixGeneration.generate(graph);
        assertFalse(adyacencyMatrix[0][0]);
        assertTrue(adyacencyMatrix[0][1]);
        assertTrue(adyacencyMatrix[1][0]);
        assertFalse(adyacencyMatrix[1][1]);
    }

    @Test
    public void testThreeVertexGraphWithEdgesIsAllTrue() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();
        graph.addVertex("Noice");
        graph.addVertex("69");
        graph.addVertex("420");
        graph.addEdge(0,1);
        graph.addEdge(1,1);
        graph.addEdge(2,1);
        boolean[][] adyacencyMatrix = adyacencyMatrixGeneration.generate(graph);
        assertFalse(adyacencyMatrix[0][0]);
        assertTrue(adyacencyMatrix[0][1]);
        assertFalse(adyacencyMatrix[0][2]);
        assertTrue(adyacencyMatrix[1][0]);
        assertTrue(adyacencyMatrix[1][1]);
        assertTrue(adyacencyMatrix[1][2]);
        assertFalse(adyacencyMatrix[2][0]);
        assertTrue(adyacencyMatrix[2][1]);
        assertFalse(adyacencyMatrix[2][2]);
    }


    @Test
    public void testTemplate() {
        Graph<String> graph = new AdjacencyMatrixGraph<>();

    }


}
