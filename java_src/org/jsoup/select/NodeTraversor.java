package org.jsoup.select;

import org.jsoup.nodes.Node;
/* loaded from: classes7.dex */
public class NodeTraversor {
    private NodeVisitor visitor;

    public NodeTraversor(NodeVisitor nodeVisitor) {
        this.visitor = nodeVisitor;
    }

    public void traverse(Node node) {
        Node node2 = node;
        int i4 = 0;
        while (node2 != null) {
            this.visitor.head(node2, i4);
            if (node2.childNodeSize() > 0) {
                node2 = node2.childNode(0);
                i4++;
            } else {
                while (node2.nextSibling() == null && i4 > 0) {
                    this.visitor.tail(node2, i4);
                    node2 = node2.parent();
                    i4--;
                }
                this.visitor.tail(node2, i4);
                if (node2 == node) {
                    return;
                }
                node2 = node2.nextSibling();
            }
        }
    }
}
