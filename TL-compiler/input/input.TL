 start begin

 text list list1 = "sofia", "kari", "inga"

 end

 functions begin

     number x
     h = "lol"

     number list numberList = 1, 2, 3, 4


     function myfunc(text k, number g) begin

         Collection Student(text name, number age)
         Student sofia = list1 get 0, 20

         Student karl
         karl get age += numberList get 2 + 2 + 5 + sofia get age

         if x equals sofia get age and numberList get 0 >= sofia get age or x is greater than 0 then

            repeat 5 times begin
                x += sofia get age
            end
            if x < 5 begin
               x += 1
            end


         end

         else if x < 5 begin
            x += 110
         end

         else if x == numberList get 0 begin
             while x is not 10 begin
                x = x + 1
             end
         end

         else begin
            sofia get age = 1
         end

         return sofia get age

     end
end