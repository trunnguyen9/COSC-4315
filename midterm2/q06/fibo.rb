RubyVM::InstructionSequence.compile_option = {
    tailcall_optimization: true,
    trace_instruction: false
}

def fibonacci(position)
    case position    
    when 0
        0
    when 1
        0
    else
        fibonacciHelper(2, position, [1, 1])
    end
end

def fibonacciHelper(position, upperLimit, lookUpTable)
    if(position < upperLimit)
        currentValue = lookUpTable[position - 2] + lookUpTable[position - 1]
        fibonacciHelper(position + 1, upperLimit, lookUpTable + [currentValue])
    else
        lookUpTable[position - 2] + lookUpTable[position - 1]
    end
end

puts fibonacci(400)
