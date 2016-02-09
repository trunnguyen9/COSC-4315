require 'minitest/autorun'
require_relative '../src/rod_cutter'

class RodCutterTest < Minitest::Test
  def setup
    @prices = {1 => 1, 2 => 2, 3 => 3, 4 => 4}
    @pricesMissingLengths = {1 => 1, 3 => 3, 5 => 4}
    @rodCutter = RodCutter.new
  end

  def test_size_0
    expected = [0, [[]]]

    assert_equal(expected, @rodCutter.getBestSolutions(0, @prices))
  end

  def test_size_1
    expected = [1, [[1]]]

    assert_equal(expected, @rodCutter.getBestSolutions(1, @prices))
  end

  def test_size_2
    expected = [2, [[2], [1, 1]]]

    assert_equal(expected, @rodCutter.getBestSolutions(2, @prices))
  end

  def test_size_3
    expected = [3, [[3], [1, 2], [1, 1, 1]]]
    assert_equal(expected, @rodCutter.getBestSolutions(3, @prices))
  end

  def test_size_4
    expected = [4, [[4], [1, 3], [1, 1, 2], [1, 1, 1, 1], [2, 2]]]
    assert_equal(expected, @rodCutter.getBestSolutions(4, @prices))
  end

  def test_priceListMissingLengths
    expected = [5, [[1, 1, 3], [1, 1, 1, 1, 1]]]
    assert_equal(expected, @rodCutter.getBestSolutions(5, @pricesMissingLengths))
  end

  def test_solutionNotIncludeLengthItself
    expected = [5, [[1, 4], [1, 1, 3], [1, 1, 1, 2], [1, 1, 1, 1, 1], [1, 2, 2], [2, 3]]]
    assert_equal(expected, @rodCutter.getBestSolutions(5, @prices))
  end

end