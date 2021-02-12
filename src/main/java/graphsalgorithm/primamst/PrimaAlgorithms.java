package graphsalgorithm.primamst;

import java.lang.reflect.Array;
import java.util.*;

public class PrimaAlgorithms {

    public static List<Edge> findMst(List<Vertex> vertexes, List<Edge> edges) {
        Vertex start = vertexes.get(0);
        start.setWeight(0);
        List<Edge> mst = new ArrayList<>();

        while (start != null) {
            List<Edge> min = new ArrayList<>();

            for (Edge edge : edges) {
                if (edge.getFrom().equals(start) || edge.getTo().equals(start)) {
                    if (edge.getFrom().getVisited() != true && edge.getTo().getVisited() != true) {
                        min.add(edge);
                    }
                }
            }

            start.setVisited(true);
            if (!min.isEmpty()) {
                Edge curentEdge = Collections.min(min);
                mst.add(curentEdge);
                start = curentEdge.getFrom().equals(start) ? curentEdge.getTo() : curentEdge.getFrom();
            } else {
                start = null;
            }
        }

        for (Vertex v : vertexes) {
            List<Edge> min = new ArrayList<>();
            if (v.getVisited() == true) {
                continue;
            } else {
                for (Edge edge : edges) {

                    if ((edge.getFrom().equals(v) && edge.getTo().getVisited() == true)
                            || (edge.getTo().equals(v) && edge.getFrom().getVisited() == true)) {
                        min.add(edge);
                    }
                }
            }

            v.setVisited(true);
            if (!min.isEmpty()) {
                mst.add(Collections.min(min));
            }
        }

        return mst;
    }


    public static void main(String[] args) {
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex g = new Vertex("G");
        Vertex e = new Vertex("E");

        Edge ab = new Edge(a, b, 4);
        Edge bc = new Edge(b, c, 12);
        Edge cd = new Edge(c, d, 10);
        Edge da = new Edge(d, a, 3);
        Edge ag = new Edge(a, g, 5);
        Edge gb = new Edge(g, b, 7);
        Edge de = new Edge(d, e, 17);
        Edge ec = new Edge(e, c, 21);

        List<Edge> res = findMst(new ArrayList<>(Arrays.asList(a, b, c, d, g, e)), new ArrayList<>(Arrays.asList(ab, bc, cd, da, ag, gb, de, ec)));

        for (Edge r : res) {
            System.out.println(r);
        }
    }

}
