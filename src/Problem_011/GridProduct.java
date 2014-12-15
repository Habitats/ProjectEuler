package Problem_011;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by anon on 15.12.2014.
 */
public class GridProduct {

  public static void main(String[] args) {
    List<List<Integer>> grid = new ArrayList<>();
    try {
      Stream stream = Files.lines(Paths.get("src/Problem_011/grid.txt"), Charset.defaultCharset());
      stream.forEach(line -> {
        grid.add(new ArrayList<>());
        grid.get(grid.size() - 1).addAll( //
                                          Arrays.asList(line.toString().split(" ")).stream() //
                                              .map(num -> Integer.valueOf(num)) //
                                              .collect(Collectors.toList()));
      });
    } catch (IOException e) {
      e.printStackTrace();
    }

    int max = 0;
    for (int row = 0; row < grid.size(); row++) {
      for (int col = 0; col < grid.get(0).size(); col++) {
        Integer localMax = Stream.of(checkRightDiagonal(grid, row, col), //
                                     checkLeftDiagonal(grid, row, col),  //
                                     checkCol(grid, row, col), //
                                     checkRow(grid, row, col)) //
            .max((a, b) -> a.compareTo(b)).get();

        max = localMax > max ? localMax : max;
      }
    }

    System.out.println(max);

  }

  private static int checkRow(List<List<Integer>> grid, int row, int col) {
    if (row + 3 >= grid.size()) {
      return Integer.MIN_VALUE;
    }

    return grid.get(row).get(col) * grid.get(row + 1).get(col) * grid.get(row + 2).get(col) * grid.get(row + 3)
        .get(col);
  }

  private static int checkCol(List<List<Integer>> grid, int row, int col) {
    if (col + 3 >= grid.get(row).size()) {
      return Integer.MIN_VALUE;
    }
    return grid.get(row).get(col) * grid.get(row).get(col + 1) * grid.get(row).get(col + 2) * grid.get(row)
        .get(col + 3);
  }

  private static int checkLeftDiagonal(List<List<Integer>> grid, int row, int col) {
    if (col - 3 < 0 || row + 3 >= grid.size()) {
      return Integer.MIN_VALUE;
    }
    return grid.get(row).get(col) * grid.get(row + 1).get(col - 1) * grid.get(row + 2).get(col - 2) * grid.get(row + 3)
        .get(col - 3);
  }

  private static int checkRightDiagonal(List<List<Integer>> grid, int row, int col) {
    if (col + 3 >= grid.get(row).size() || row + 3 >= grid.size()) {
      return Integer.MIN_VALUE;
    }
    return grid.get(row).get(col) * grid.get(row + 1).get(col + 1) * grid.get(row + 2).get(col + 2) * grid.get(row + 3)
        .get(col + 3);

  }
}
