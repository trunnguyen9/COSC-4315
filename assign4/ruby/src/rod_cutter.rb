class RodCutter
  def getBestSolutions(size, prices)
    if(size == 0)
      return 0, [[]]
    end

    initialSolution = [getPrice(size, prices), [[size]]]
    (1..size - 1).to_a.inject(initialSolution) do |result, split|
      findBestSolution(result, getBestSolutionForSplit(split, size, prices))
    end
  end

  def getBestSolutionForSplit(split, size, prices)
    splitSolution = getBestSolutions(split, prices)
    leftOverSolution = getBestSolutions(size - split, prices)
    combinedPrice = splitSolution[0] + leftOverSolution[0]
    combinedSolution = splitSolution[1].flat_map{|firstCut| leftOverSolution[1].map{|secondCut| (firstCut + secondCut).sort}}

    [combinedPrice, combinedSolution]
  end

  def findBestSolution(firstSolution, secondSolution)
    case firstSolution[0] == secondSolution[0]
      when false
        firstSolution[0] > secondSolution[0] ? firstSolution : secondSolution
      when true
        [firstSolution[0], (firstSolution[1] + secondSolution[1]).uniq]
    end
  end

  def getPrice(size, prices)
    prices.has_key?(size) ? prices[size] : 0
  end
end