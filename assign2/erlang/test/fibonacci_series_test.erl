-module(fibonacci_series_test).
-include_lib("eunit/include/eunit.hrl").

fibonacciSeriesRecursivePosition0_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesRecursive(0), [1]).

fibonacciSeriesRecursivePosition1_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesRecursive(1), [1, 1]).

fibonacciSeriesRecursivePosition2_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesRecursive(2), [1, 1, 2]).

fibonacciSeriesRecursivePosition3_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesRecursive(3), [1, 1, 2, 3]).

fibonacciSeriesRecursivePosition4_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesRecursive(4), [1, 1, 2, 3, 5]).

fibonacciSeriesTailRecursivePosition0_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesTailRecursive(0), [1]).

fibonacciSeriesTailRecursivePosition1_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesTailRecursive(1), [1, 1]).

fibonacciSeriesTailRecursivePosition2_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesTailRecursive(2), [1, 1, 2]).

fibonacciSeriesTailRecursivePosition3_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesTailRecursive(3), [1, 1, 2, 3]).

fibonacciSeriesTailRecursivePosition4_test_() -> ?_assertEqual(fibonacci_series:fibonacciSeriesTailRecursive(4), [1, 1, 2, 3, 5]).