def getFactors(number)
    (1..number).to_a.select {|e| number % e == 0}
end

def unionFactors(numbers)
    numbers.inject([]) {|result, e| result + getFactors(e) }.uniq
end

unionFactors([2, 4, 6, 8]).each {|e| puts e}
