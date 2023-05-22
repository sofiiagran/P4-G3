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
    public NumberListDec numberListDec = new NumberListDec();
    public TextListDec textListDec = new TextListDec();
    public CollectionDec collectionDec = new CollectionDec();
    public CollectionInstanceDec collectionInstanceDec = new CollectionInstanceDec();

    /** Initialisation **/
    public NumberInit numberInit = new NumberInit();
    public TextInit textInit = new TextInit();
    public BoolInit boolInit = new BoolInit();
    public NumberListInit numberListInit = new NumberListInit();
    public TextListInit textListInit = new TextListInit();
    public CollectionInitNumber collectionInitNumber = new CollectionInitNumber();
    public CollectionInitText collectionInitText = new CollectionInitText();
    public CollectionInitBool collectionInitBool = new CollectionInitBool();
    public CollectionInitAll collectionInitAll = new CollectionInitAll();
    public CollectionInitVar collectionInitVar = new CollectionInitVar();

    /** Expressions **/
    public AssignID assignID = new AssignID();
    public AssignAnswer assignAnswer = new AssignAnswer();
    public AssignList assignList = new AssignList();
    public AssignCollection assignCollection = new AssignCollection();
    public PrintExp printExp = new PrintExp();
    public AskExp askExp = new AskExp();
    public ReturnExp returnExp = new ReturnExp();
    public MathExp mathExp = new MathExp();
    public IndexVal indexVal = new IndexVal();
    public AnswerVal answerVal = new AnswerVal();
    public CollectionVal collectionVal = new CollectionVal();

    /** Conditions **/
    public Condition1 condition1 = new Condition1();
    public Condition2 condition2 = new Condition2();
    public Condition3 condition3 = new Condition3();

    /** Operations **/
    public ConOp conOp = new ConOp();
    public MathOp1 mathOp1 = new MathOp1();
    public MathOp2 mathOp2 = new MathOp2();
}
