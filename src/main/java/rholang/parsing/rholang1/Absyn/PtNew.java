package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class PtNew extends Pattern {
  public final ListVarPattern listvarpattern_;
  public final Pattern pattern_;
  public PtNew(ListVarPattern p1, Pattern p2) { listvarpattern_ = p1; pattern_ = p2; }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Pattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.PtNew) {
      rholang.parsing.rholang1.Absyn.PtNew x = (rholang.parsing.rholang1.Absyn.PtNew)o;
      return this.listvarpattern_.equals(x.listvarpattern_) && this.pattern_.equals(x.pattern_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.listvarpattern_.hashCode())+this.pattern_.hashCode();
  }


}
