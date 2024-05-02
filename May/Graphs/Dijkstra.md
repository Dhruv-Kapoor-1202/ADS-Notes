# Dijkstra's Algorithm

- It is used for solving `single-source` shortest path problems havinf `non-negative` edge weight in the graph. 
- It is used to find the **shortest distance** betweeen **two vertices** on a graph. 
- It was conceived by Dutch computer scientist `Edsger W. Dijkstra` in `1956`.

```mermaid
flowchart LR
  1((1))
  2((2))
  3((3))
  4((4))

  1 --- |3|2
  1 --- |6|3
  2 --- |4|4
  2 --- |2|3
  3 --- |1|4


```