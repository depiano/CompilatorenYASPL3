package Visitor;

/* Visitatore che mi restituisce l'XML */

import org.apache.commons.lang3.StringEscapeUtils;

import SyntaxTree.ArrayAssignOp;
import SyntaxTree.ArrayIndexOp;
import SyntaxTree.ArrayOp;
import SyntaxTree.AssignOp;
import SyntaxTree.CallOp;
import SyntaxTree.CaseListOp;
import SyntaxTree.CaseOp;
import SyntaxTree.ConditionalOp;
import SyntaxTree.DecreaseOp;
import SyntaxTree.DefaultOp;
import SyntaxTree.ForOp;
import SyntaxTree.UseNode;
import SyntaxTree.IfThenElseOp;
import SyntaxTree.IfThenOp;
import SyntaxTree.IncrementsOp;
import SyntaxTree.InternalDefOp;
import SyntaxTree.Leaf;
import SyntaxTree.MathOp;
import SyntaxTree.ModOp;
import SyntaxTree.ScopeNode;
import SyntaxTree.Node;
import SyntaxTree.OpNode;
import SyntaxTree.ParOp;
import SyntaxTree.ProcDeclOp;
import SyntaxTree.ProgramOp;
import SyntaxTree.ReadOp;
import SyntaxTree.SingleOp;
import SyntaxTree.StructInitOp;
import SyntaxTree.StructOp;
import SyntaxTree.SwitchOp;
import SyntaxTree.VarDeclOp;
import SyntaxTree.VarInitOp;
import SyntaxTree.WhileOp;
import SyntaxTree.WriteOp;

@SuppressWarnings("deprecation")
public class XMLVisitor implements Visitor{

	public Object visit(Node n){
		return null;
	}
	
	public Object visit(OpNode n) {
		System.out.println(n.getOp());
		String toPrint = "";
		toPrint += "<"+n.getOp()+">\n";
		for (Node node : n.nodeList()){
			if (node!=null){
				try {
					toPrint += node.accept(this)+"";
				} catch (Exception e) {
					System.out.println(e);;
				}
			}
			else 
				toPrint += "<null/>\n";
		}
		toPrint += "</"+n.getOp()+">\n";
		return toPrint;
	}

	public Object visit(Leaf n) {
		String toPrint = "";
		toPrint += "<" + n.getOp();
		if (n.getVal() != null) {
			toPrint += " attr='" + StringEscapeUtils.escapeXml(n.getVal().toString()) + "'";
		}
		toPrint += "/>\n";
		return toPrint;
	}

	@Override
	public Object visit(UseNode node) {
		return this.visit((OpNode) node);
	}

	

	@Override
	public Object visit(ScopeNode node) throws Exception{
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(MathOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(SingleOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(ConditionalOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(IfThenOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(IfThenElseOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(CallOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(AssignOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(WriteOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(ReadOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(VarDeclOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(ProgramOp node) throws Exception {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(ProcDeclOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(ParOp node) throws Exception {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(VarInitOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(WhileOp node) {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(ForOp node) throws Exception {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(IncrementsOp node) throws Exception {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(ModOp node) throws Exception {
		return this.visit((OpNode) node);
	}

	@Override
	public Object visit(DecreaseOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(SwitchOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(CaseOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(DefaultOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(ArrayOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(ArrayAssignOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(ArrayIndexOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(StructOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(StructInitOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(CaseListOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	@Override
	public Object visit(InternalDefOp node) throws Exception {
		return this.visit((OpNode)node);
	}

	
}
