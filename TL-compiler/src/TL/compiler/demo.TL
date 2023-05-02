start begin

    number a
    text b
    truthvalue c

    myFunction
    anotherFunc

end

functions begin

    function myFunction begin

        a = 5
        b = "hei"
        c = false

        repeat 5 times then
            a += 5
        end

        ask person1 "What is you name?"

        print "lol" + 5 + a + b + c

    end

    function anotherFunc begin

        repeat until a == 5 then
            a += 2
        end

        return a
    end

end






