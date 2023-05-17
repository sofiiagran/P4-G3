package TL.compiler.CodeGen;

import TL.compiler.CodeGen.Visitors.*;

public class CST {

    /******** Create instances of functions used for visiting ********/

    /** Function **/
    public FuncDec funcDec = new FuncDec();
    public FuncOutParam funcOutParam = new FuncOutParam();
    public FuncInParam funcInParam = new FuncInParam();

    /** Declaration **/
    public NumberDec numberDec = new NumberDec();
    public TextDec textDec = new TextDec();
    public BoolDec boolDec = new BoolDec();

    /** Initialisation **/
    public NumberInit numberInit = new NumberInit();
    public TextInit textInit = new TextInit();
    public BoolInit boolInit = new BoolInit();

    /** Expressions **/
    public Assignment assignment = new Assignment();
    public PrintExp printExp = new PrintExp();
    public AskExp askExp = new AskExp();
    public ReturnExp returnExp = new ReturnExp();
    public AnswerExp answerExp = new AnswerExp();
    public MathExp mathExp = new MathExp();

    /** Conditions **/
    public Condition1 condition1 = new Condition1();
    public Condition2 condition2 = new Condition2();
    public Condition3 condition3 = new Condition3();

    /** Operations **/
    public ConOp conOp = new ConOp();
    public MathOp1 mathOp1 = new MathOp1();
    public MathOp2 mathOp2 = new MathOp2();
}
