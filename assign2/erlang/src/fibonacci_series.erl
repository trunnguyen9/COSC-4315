-module(fibonacci_series).
-compile(export_all).

fibonacciSeriesRecursive(0) -> [1];
fibonacciSeriesRecursive(1) -> [1, 1];
fibonacciSeriesRecursive(N) when N > 1 -> Previous = fibonacciSeriesRecursive(N - 1),
                                          Previous ++ [lists:sum(lists:nthtail(length(Previous) - 2, Previous))].

fibonacciSeriesTailRecursive(0) -> [1];
fibonacciSeriesTailRecursive(N) -> fibonacciSeriesTailRecursive(N, [1, 1]).

fibonacciSeriesTailRecursive(1, Series) -> Series;
fibonacciSeriesTailRecursive(N, Series) -> fibonacciSeriesTailRecursive(N - 1, Series ++ [lists:sum(lists:nthtail(length(Series) - 2, Series))]).

