
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Thu Jun 30 12:32:17 CEST 2016
//----------------------------------------------------

package rholang.parsing.delimc;


/** CUP v0.10k generated parser.
  * @version Thu Jun 30 12:32:17 CEST 2016
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\003\005\000\002\003" +
    "\003\000\002\003\013\000\002\003\007\000\002\003\006" +
    "\000\002\003\007\000\002\003\003\000\002\003\007\000" +
    "\002\003\007\000\002\003\007\000\002\003\005\000\002" +
    "\004\007\000\002\004\011\000\002\005\003\000\002\005" +
    "\003\000\002\006\003\000\002\006\005\000\002\007\003" +
    "\000\002\007\003\000\002\010\005\000\002\010\005\000" +
    "\002\010\003\000\002\011\007\000\002\011\011" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\102\000\014\005\006\015\011\022\004\023\010\025" +
    "\013\001\002\000\036\002\ufff2\005\ufff2\007\ufff2\010\ufff2" +
    "\013\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2\020\ufff2\021" +
    "\ufff2\022\ufff2\023\ufff2\025\ufff2\001\002\000\036\002\uffff" +
    "\005\uffff\007\uffff\010\uffff\013\uffff\014\uffff\015\uffff\016" +
    "\uffff\017\uffff\020\uffff\021\uffff\022\uffff\023\uffff\025\uffff" +
    "\001\002\000\014\005\006\015\011\022\004\023\010\025" +
    "\067\001\002\000\020\002\043\005\006\015\011\020\044" +
    "\022\004\023\010\025\013\001\002\000\036\002\ufff3\005" +
    "\ufff3\007\ufff3\010\ufff3\013\ufff3\014\ufff3\015\ufff3\016\ufff3" +
    "\017\ufff3\020\ufff3\021\ufff3\022\ufff3\023\ufff3\025\ufff3\001" +
    "\002\000\036\002\ufffa\005\ufffa\007\ufffa\010\ufffa\013\ufffa" +
    "\014\ufffa\015\ufffa\016\ufffa\017\ufffa\020\ufffa\021\ufffa\022" +
    "\ufffa\023\ufffa\025\ufffa\001\002\000\004\004\040\001\002" +
    "\000\004\004\014\001\002\000\010\005\017\012\022\024" +
    "\020\001\002\000\044\002\uffef\005\uffef\006\uffef\007\uffef" +
    "\010\uffef\011\uffef\013\uffef\014\uffef\015\uffef\016\uffef\017" +
    "\uffef\020\uffef\021\uffef\022\uffef\023\uffef\024\uffef\025\uffef" +
    "\001\002\000\036\002\000\005\000\007\000\010\000\013" +
    "\000\014\000\015\000\016\000\017\000\020\000\021\000" +
    "\022\000\023\000\025\000\001\002\000\010\005\017\012" +
    "\022\024\020\001\002\000\044\002\ufff1\005\ufff1\006\ufff1" +
    "\007\ufff1\010\ufff1\011\ufff1\013\ufff1\014\ufff1\015\ufff1\016" +
    "\ufff1\017\ufff1\020\ufff1\021\ufff1\022\ufff1\023\ufff1\024\ufff1" +
    "\025\ufff1\001\002\000\044\002\uffee\005\uffee\006\uffee\007" +
    "\uffee\010\uffee\011\uffee\013\uffee\014\uffee\015\uffee\016\uffee" +
    "\017\uffee\020\uffee\021\uffee\022\uffee\023\uffee\024\uffee\025" +
    "\uffee\001\002\000\006\005\017\024\020\001\002\000\042" +
    "\002\uffeb\005\uffeb\006\uffeb\007\uffeb\010\uffeb\011\024\013" +
    "\uffeb\014\uffeb\015\uffeb\016\uffeb\017\uffeb\020\uffeb\021\uffeb" +
    "\022\uffeb\023\uffeb\025\uffeb\001\002\000\010\005\017\012" +
    "\022\024\020\001\002\000\040\002\uffec\005\uffec\006\uffec" +
    "\007\uffec\010\uffec\013\uffec\014\uffec\015\uffec\016\uffec\017" +
    "\uffec\020\uffec\021\uffec\022\uffec\023\uffec\025\uffec\001\002" +
    "\000\006\005\017\024\020\001\002\000\040\002\uffed\005" +
    "\uffed\006\uffed\007\uffed\010\uffed\013\uffed\014\uffed\015\uffed" +
    "\016\uffed\017\uffed\020\uffed\021\uffed\022\uffed\023\uffed\025" +
    "\uffed\001\002\000\006\007\032\010\031\001\002\000\010" +
    "\005\017\012\022\024\020\001\002\000\044\002\ufff0\005" +
    "\ufff0\006\ufff0\007\ufff0\010\ufff0\011\ufff0\013\ufff0\014\ufff0" +
    "\015\ufff0\016\ufff0\017\ufff0\020\ufff0\021\ufff0\022\ufff0\023" +
    "\ufff0\024\ufff0\025\ufff0\001\002\000\006\007\035\010\034" +
    "\001\002\000\010\005\017\012\022\024\020\001\002\000" +
    "\044\002\uffea\005\uffea\006\uffea\007\uffea\010\uffea\011\uffea" +
    "\013\uffea\014\uffea\015\uffea\016\uffea\017\uffea\020\uffea\021" +
    "\uffea\022\uffea\023\uffea\024\uffea\025\uffea\001\002\000\004" +
    "\007\037\001\002\000\044\002\uffe9\005\uffe9\006\uffe9\007" +
    "\uffe9\010\uffe9\011\uffe9\013\uffe9\014\uffe9\015\uffe9\016\uffe9" +
    "\017\uffe9\020\uffe9\021\uffe9\022\uffe9\023\uffe9\024\uffe9\025" +
    "\uffe9\001\002\000\010\005\017\012\022\024\020\001\002" +
    "\000\036\002\ufff6\005\ufff6\007\ufff6\010\ufff6\013\ufff6\014" +
    "\ufff6\015\ufff6\016\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6" +
    "\023\ufff6\025\ufff6\001\002\000\030\005\006\013\050\014" +
    "\047\015\011\016\053\017\052\020\044\021\051\022\004" +
    "\023\010\025\013\001\002\000\004\002\001\001\002\000" +
    "\004\004\045\001\002\000\010\005\017\012\022\024\020" +
    "\001\002\000\036\002\ufffc\005\ufffc\007\ufffc\010\ufffc\013" +
    "\ufffc\014\ufffc\015\ufffc\016\ufffc\017\ufffc\020\ufffc\021\ufffc" +
    "\022\ufffc\023\ufffc\025\ufffc\001\002\000\004\004\064\001" +
    "\002\000\004\004\062\001\002\000\004\004\060\001\002" +
    "\000\004\004\056\001\002\000\004\004\054\001\002\000" +
    "\010\005\017\012\022\024\020\001\002\000\036\002\ufff9" +
    "\005\ufff9\007\ufff9\010\ufff9\013\ufff9\014\ufff9\015\ufff9\016" +
    "\ufff9\017\ufff9\020\ufff9\021\ufff9\022\ufff9\023\ufff9\025\ufff9" +
    "\001\002\000\010\005\017\012\022\024\020\001\002\000" +
    "\036\002\ufff7\005\ufff7\007\ufff7\010\ufff7\013\ufff7\014\ufff7" +
    "\015\ufff7\016\ufff7\017\ufff7\020\ufff7\021\ufff7\022\ufff7\023" +
    "\ufff7\025\ufff7\001\002\000\010\005\017\012\022\024\020" +
    "\001\002\000\036\002\ufff8\005\ufff8\007\ufff8\010\ufff8\013" +
    "\ufff8\014\ufff8\015\ufff8\016\ufff8\017\ufff8\020\ufff8\021\ufff8" +
    "\022\ufff8\023\ufff8\025\ufff8\001\002\000\010\005\017\012" +
    "\022\024\020\001\002\000\036\002\ufffd\005\ufffd\007\ufffd" +
    "\010\ufffd\013\ufffd\014\ufffd\015\ufffd\016\ufffd\017\ufffd\020" +
    "\ufffd\021\ufffd\022\ufffd\023\ufffd\025\ufffd\001\002\000\010" +
    "\005\017\012\022\024\020\001\002\000\036\002\ufffb\005" +
    "\ufffb\007\ufffb\010\ufffb\013\ufffb\014\ufffb\015\ufffb\016\ufffb" +
    "\017\ufffb\020\ufffb\021\ufffb\022\ufffb\023\ufffb\025\ufffb\001" +
    "\002\000\020\005\006\010\077\015\011\020\044\022\004" +
    "\023\010\025\013\001\002\000\004\004\070\001\002\000" +
    "\010\005\017\012\022\024\020\001\002\000\022\005\000" +
    "\006\072\010\000\015\000\020\000\022\000\023\000\025" +
    "\000\001\002\000\014\005\006\015\011\022\004\023\010" +
    "\025\013\001\002\000\020\005\006\007\074\015\011\020" +
    "\044\022\004\023\010\025\013\001\002\000\004\004\075" +
    "\001\002\000\010\005\017\012\022\024\020\001\002\000" +
    "\036\002\ufffe\005\ufffe\007\ufffe\010\ufffe\013\ufffe\014\ufffe" +
    "\015\ufffe\016\ufffe\017\ufffe\020\ufffe\021\ufffe\022\ufffe\023" +
    "\ufffe\025\ufffe\001\002\000\014\005\006\015\011\022\004" +
    "\023\010\025\013\001\002\000\022\005\006\007\102\010" +
    "\101\015\011\020\044\022\004\023\010\025\013\001\002" +
    "\000\014\005\006\015\011\022\004\023\010\025\013\001" +
    "\002\000\004\004\ufff5\001\002\000\020\005\006\007\104" +
    "\015\011\020\044\022\004\023\010\025\013\001\002\000" +
    "\004\004\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\102\000\010\003\006\004\011\005\004\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\003\065\004\011" +
    "\005\004\001\001\000\010\003\041\004\011\005\004\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\006\020\007\022\010\015\011" +
    "\014\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\006\020\007\022\010\027\011\014\001\001\000\002\001" +
    "\001\000\002\001\001\000\010\006\020\007\025\011\014" +
    "\001\001\000\002\001\001\000\012\006\020\007\022\010" +
    "\024\011\014\001\001\000\002\001\001\000\010\006\020" +
    "\007\026\011\014\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\006\020\007\022\010\032\011\014\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\006\020\007" +
    "\022\010\035\011\014\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\006\020\007\022\010" +
    "\040\011\014\001\001\000\002\001\001\000\010\003\041" +
    "\004\011\005\004\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\006\020\007\022\010\045\011\014\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\012" +
    "\006\020\007\022\010\054\011\014\001\001\000\002\001" +
    "\001\000\012\006\020\007\022\010\056\011\014\001\001" +
    "\000\002\001\001\000\012\006\020\007\022\010\060\011" +
    "\014\001\001\000\002\001\001\000\012\006\020\007\022" +
    "\010\062\011\014\001\001\000\002\001\001\000\012\006" +
    "\020\007\022\010\064\011\014\001\001\000\002\001\001" +
    "\000\010\003\041\004\011\005\004\001\001\000\002\001" +
    "\001\000\012\006\020\007\022\010\070\011\014\001\001" +
    "\000\002\001\001\000\010\003\072\004\011\005\004\001" +
    "\001\000\010\003\041\004\011\005\004\001\001\000\002" +
    "\001\001\000\012\006\020\007\022\010\075\011\014\001" +
    "\001\000\002\001\001\000\010\003\077\004\011\005\004" +
    "\001\001\000\010\003\041\004\011\005\004\001\001\000" +
    "\010\003\102\004\011\005\004\001\001\000\002\001\001" +
    "\000\010\003\041\004\011\005\004\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  public rholang.parsing.delimc.Absyn.Expr pExpr() throws Exception
  {
	java_cup.runtime.Symbol res = parse();
	return (rholang.parsing.delimc.Absyn.Expr) res.value;
  }

public <B,A extends java.util.LinkedList<? super B>> A cons_(B x, A xs) { xs.addFirst(x); return xs; }

public void syntax_error(java_cup.runtime.Symbol cur_token)
{
	report_error("Syntax Error, trying to recover and continue parse...", cur_token);
}

public void unrecovered_syntax_error(java_cup.runtime.Symbol cur_token) throws java.lang.Exception
{
	throw new Exception("Unrecoverable Syntax Error");
}


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // TType ::= _SYMB_1 Type _SYMB_4 Type _SYMB_4 Type _SYMB_3 
            {
              rholang.parsing.delimc.Absyn.TType RESULT = null;
		rholang.parsing.delimc.Absyn.Type p_2 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		rholang.parsing.delimc.Absyn.Type p_4 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Type p_6 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.TType3(p_2,p_4,p_6); 
              CUP$parser$result = new java_cup.runtime.Symbol(7/*TType*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // TType ::= _SYMB_1 Type _SYMB_4 Type _SYMB_3 
            {
              rholang.parsing.delimc.Absyn.TType RESULT = null;
		rholang.parsing.delimc.Absyn.Type p_2 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Type p_4 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.TType2(p_2,p_4); 
              CUP$parser$result = new java_cup.runtime.Symbol(7/*TType*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Type ::= Type1 
            {
              rholang.parsing.delimc.Absyn.Type RESULT = null;
		rholang.parsing.delimc.Absyn.Type p_1 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = p_1; 
              CUP$parser$result = new java_cup.runtime.Symbol(6/*Type*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Type ::= Type1 _SYMB_5 Type 
            {
              rholang.parsing.delimc.Absyn.Type RESULT = null;
		rholang.parsing.delimc.Absyn.Type p_1 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		rholang.parsing.delimc.Absyn.Type p_3 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.TFun(p_1,p_3); 
              CUP$parser$result = new java_cup.runtime.Symbol(6/*Type*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Type ::= _SYMB_6 Type1 Type1 
            {
              rholang.parsing.delimc.Absyn.Type RESULT = null;
		rholang.parsing.delimc.Absyn.Type p_2 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		rholang.parsing.delimc.Absyn.Type p_3 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.TMonad(p_2,p_3); 
              CUP$parser$result = new java_cup.runtime.Symbol(6/*Type*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Type1 ::= Type2 
            {
              rholang.parsing.delimc.Absyn.Type RESULT = null;
		rholang.parsing.delimc.Absyn.Type p_1 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = p_1; 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*Type1*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Type1 ::= TType 
            {
              rholang.parsing.delimc.Absyn.Type RESULT = null;
		rholang.parsing.delimc.Absyn.TType p_1 = (rholang.parsing.delimc.Absyn.TType)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.TTuple(p_1); 
              CUP$parser$result = new java_cup.runtime.Symbol(5/*Type1*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Type2 ::= _SYMB_1 Type _SYMB_3 
            {
              rholang.parsing.delimc.Absyn.Type RESULT = null;
		rholang.parsing.delimc.Absyn.Type p_2 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = p_2; 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*Type2*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Type2 ::= SimpleType 
            {
              rholang.parsing.delimc.Absyn.Type RESULT = null;
		String p_1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.TSimple(p_1); 
              CUP$parser$result = new java_cup.runtime.Symbol(4/*Type2*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Value ::= _STRING_ 
            {
              rholang.parsing.delimc.Absyn.Value RESULT = null;
		String p_1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.VString(p_1); 
              CUP$parser$result = new java_cup.runtime.Symbol(3/*Value*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Value ::= _INTEGER_ 
            {
              rholang.parsing.delimc.Absyn.Value RESULT = null;
		Integer p_1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.VInt(p_1); 
              CUP$parser$result = new java_cup.runtime.Symbol(3/*Value*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Tuple ::= _SYMB_1 Expr _SYMB_4 Expr _SYMB_4 Expr _SYMB_3 
            {
              rholang.parsing.delimc.Absyn.Tuple RESULT = null;
		rholang.parsing.delimc.Absyn.Expr p_2 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		rholang.parsing.delimc.Absyn.Expr p_4 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Expr p_6 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.Tuple3(p_2,p_4,p_6); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*Tuple*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Tuple ::= _SYMB_1 Expr _SYMB_4 Expr _SYMB_3 
            {
              rholang.parsing.delimc.Absyn.Tuple RESULT = null;
		rholang.parsing.delimc.Absyn.Expr p_2 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Expr p_4 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.Tuple2(p_2,p_4); 
              CUP$parser$result = new java_cup.runtime.Symbol(2/*Tuple*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Expr ::= Tuple _SYMB_0 Type 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		rholang.parsing.delimc.Absyn.Tuple p_1 = (rholang.parsing.delimc.Absyn.Tuple)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		rholang.parsing.delimc.Absyn.Type p_3 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.ETuple(p_1,p_3); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Expr ::= Expr Expr _SYMB_11 _SYMB_0 Type 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		rholang.parsing.delimc.Absyn.Expr p_1 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		rholang.parsing.delimc.Absyn.Expr p_2 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Type p_5 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.EPushSubCont(p_1,p_2,p_5); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Expr ::= Expr Expr _SYMB_13 _SYMB_0 Type 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		rholang.parsing.delimc.Absyn.Expr p_1 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		rholang.parsing.delimc.Absyn.Expr p_2 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Type p_5 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.EWithSubCont(p_1,p_2,p_5); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Expr ::= Expr Expr _SYMB_10 _SYMB_0 Type 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		rholang.parsing.delimc.Absyn.Expr p_1 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		rholang.parsing.delimc.Absyn.Expr p_2 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Type p_5 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.EPushPrompt(p_1,p_2,p_5); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Expr ::= _SYMB_9 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		 RESULT = new rholang.parsing.delimc.Absyn.ENewPrompt(); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Expr ::= Expr Expr _SYMB_8 _SYMB_0 Type 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		rholang.parsing.delimc.Absyn.Expr p_1 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		rholang.parsing.delimc.Absyn.Expr p_2 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Type p_5 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.EBind(p_1,p_2,p_5); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Expr ::= Expr _SYMB_12 _SYMB_0 Type 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		rholang.parsing.delimc.Absyn.Expr p_1 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Type p_4 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.EReturn(p_1,p_4); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Expr ::= Expr Expr _SYMB_7 _SYMB_0 Type 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		rholang.parsing.delimc.Absyn.Expr p_1 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		rholang.parsing.delimc.Absyn.Expr p_2 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Type p_5 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.EApp(p_1,p_2,p_5); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Expr ::= _SYMB_1 Var _SYMB_0 Type _SYMB_2 Expr _SYMB_3 _SYMB_0 Type 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		String p_2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-7)).value;
		rholang.parsing.delimc.Absyn.Type p_4 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		rholang.parsing.delimc.Absyn.Expr p_6 = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		rholang.parsing.delimc.Absyn.Type p_9 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.EAbs(p_2,p_4,p_6,p_9); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Expr ::= Value 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		rholang.parsing.delimc.Absyn.Value p_1 = (rholang.parsing.delimc.Absyn.Value)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.EVal(p_1); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Expr ::= Var _SYMB_0 Type 
            {
              rholang.parsing.delimc.Absyn.Expr RESULT = null;
		String p_1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		rholang.parsing.delimc.Absyn.Type p_3 = (rholang.parsing.delimc.Absyn.Type)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-0)).value;
		 RESULT = new rholang.parsing.delimc.Absyn.EVar(p_1,p_3); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*Expr*/, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Expr EOF 
            {
              Object RESULT = null;
		rholang.parsing.delimc.Absyn.Expr start_val = (rholang.parsing.delimc.Absyn.Expr)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

