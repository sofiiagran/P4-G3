 start begin

 run getName
 run getAge

 end

 functions begin

     function getName begin
         ask text question1 "What is your name?\n"
         print question1
     end

     function getAge begin
        ask number question2 "what is your age?\n"
        print question2
     end
end