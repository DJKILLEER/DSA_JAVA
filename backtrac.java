public class backtrac {

  public static void ChangeArr(int arr[], int i, int val) {
    // base case
    if (i == arr.length) {
      printArr(arr);
      return;
    }
    // recurssion(kamm)
    arr[i] = val;
    ChangeArr(arr, i + 1, val + 1);
    arr[i] = arr[i] - 2;
  }

  public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void findSubsets(String str, String ans, int i) {
    // base
    if (i == str.length()) {
      System.out.println(ans);
      return;
    }

    // Yes choice
    findSubsets(str, ans + str.charAt(i), i + 1);
    // No Choice
    findSubsets(str, ans, i + 1);

  }

  public static void permutations(String str, String ans) {
    // base case
    if (str.length() == 0) {
      System.out.println(ans);
      return;
    }
    // kamm
    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      String Newstr = str.substring(0, i) + str.substring(i + 1);
      permutations(Newstr, ans + curr);
    }
  }

  public static boolean isSSafe(char board[][], int row, int col) {
    // vertical up
    for (int i = row - 1; i >= 0; i--) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }

    // diagonal left up
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    // diagonal right up
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
      if (board[i][j] == 'Q') {
        return false;
      }
    }

    return true;
  }

  // public static void nQueens(char board[][], int row) {
  // // base case: if all queens are placed
  // if (row == board.length) {
  // printBoard(board);
  // return;
  // }

  // try placing the queen in all columns one by one
  // for (int j = 0; j < board.length; j++) {
  // if (isSafe(board, row, j)) {
  // board[row][j] = 'Q'; // place queen
  // nQueens(board, row + 1); // recursively place rest of the queens
  // board[row][j] = 'x'; // backtrack
  // }
  // }
  // }

  // public static void printBoard(char board[][]) {
  // System.out.println("----------- Chess board ------------");
  // for (int i = 0; i < board.length; i++) {
  // for (int j = 0; j < board.length; j++) {
  // System.out.print(board[i][j] + " ");
  // }
  // System.out.println();
  // }
  // }
  // public static int gridways(int i, int j, int n, int m) {
  //   // base cade
  //   if (i == n - 1 && j == m - 1) {
  //     return 1;
  //   } else if (i == n || j == n) {
  //     return 0;
  //   }
  //   int w1 = gridways(i + 1, j, n, m);
  //   int w2 = gridways(i, j + ṇ1, n, m);
  //   return w1 + w2;
  // }

  public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
    // coloum
    for (int i = 0; i <= 8; i++) {
      if (sudoku[i][col] == digit) {
        return false;
      }
    }
    // row
    for (int j = 0; j <= 8; j++) {
      if (sudoku[row][j] == digit) {
        return false;
      }
    }
    // grid
    int sr = (row / 3) * 3;
    int sc = (col / 3) * 3;
    for (int i = sr; i < sr + 3; i++) {
      for (int j = sc; j < sc + 3; j++) {
        if (sudoku[i][j] == digit) {
          return false;
        }
      }
    }
    return true;

  }

  public static boolean sudokuSolver(int sudoku[][], int row, int col) {
    // base case
    if (row == 9) {
      return true;
    }
    // work
    int nextRow = row, nextCol = col + 1;
    if (col + 1 == 9) {
      nextRow = row + 1;
      nextCol = 0;
    }
    if (sudoku[row][col] != 0) {
      return sudokuSolver(sudoku, nextRow, nextCol);
    }
    for (int digit = 1; digit <= 9; digit++) {
      if (isSafe(sudoku, row, col, digit)) {
        sudoku[row][col] = digit;
        if (sudokuSolver(sudoku, nextRow, nextCol)) {
          // soln exist
          return true;
        }
        sudoku[row][col] = 0;
      }
    }
    return false;
  }

  public static void printsudoku(int sudoku[][]) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(sudoku[i][j] + " ");
      }
      System.out.println();
    }

  }

  public static void main(String[] args) {
    int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
        { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
        { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
        { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
        { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
        { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
        { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
        { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
        { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
    };
    if (sudokuSolver(sudoku, 0, 0)) {
      System.out.println("Solution Exists");
      printsudoku(sudoku);
    } else {
      System.out.println("Solution does not exist");
    }
  }
}