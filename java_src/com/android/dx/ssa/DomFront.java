package com.android.dx.ssa;

import com.android.dx.util.IntSet;
import io.netty.util.internal.StringUtil;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class DomFront {
    private static final boolean DEBUG = false;
    private final DomInfo[] domInfos;
    private final SsaMethod meth;
    private final ArrayList<SsaBasicBlock> nodes;

    /* loaded from: classes2.dex */
    public static class DomInfo {
        public IntSet dominanceFrontiers;
        public int idom = -1;
    }

    public DomFront(SsaMethod ssaMethod) {
        this.meth = ssaMethod;
        ArrayList<SsaBasicBlock> blocks = ssaMethod.getBlocks();
        this.nodes = blocks;
        int size = blocks.size();
        this.domInfos = new DomInfo[size];
        for (int i4 = 0; i4 < size; i4++) {
            this.domInfos[i4] = new DomInfo();
        }
    }

    private void buildDomTree() {
        int size = this.nodes.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = this.domInfos[i4].idom;
            if (i5 != -1) {
                this.nodes.get(i5).addDomChild(this.nodes.get(i4));
            }
        }
    }

    private void calcDomFronts() {
        int size = this.nodes.size();
        for (int i4 = 0; i4 < size; i4++) {
            DomInfo domInfo = this.domInfos[i4];
            BitSet predecessors = this.nodes.get(i4).getPredecessors();
            if (predecessors.cardinality() > 1) {
                for (int nextSetBit = predecessors.nextSetBit(0); nextSetBit >= 0; nextSetBit = predecessors.nextSetBit(nextSetBit + 1)) {
                    int i5 = nextSetBit;
                    while (i5 != domInfo.idom && i5 != -1) {
                        DomInfo domInfo2 = this.domInfos[i5];
                        if (domInfo2.dominanceFrontiers.has(i4)) {
                            break;
                        }
                        domInfo2.dominanceFrontiers.add(i4);
                        i5 = domInfo2.idom;
                    }
                }
            }
        }
    }

    private void debugPrintDomChildren() {
        int size = this.nodes.size();
        for (int i4 = 0; i4 < size; i4++) {
            SsaBasicBlock ssaBasicBlock = this.nodes.get(i4);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append('{');
            Iterator<SsaBasicBlock> it2 = ssaBasicBlock.getDomChildren().iterator();
            boolean z4 = false;
            while (it2.hasNext()) {
                SsaBasicBlock next = it2.next();
                if (z4) {
                    stringBuffer.append(StringUtil.COMMA);
                }
                stringBuffer.append(next);
                z4 = true;
            }
            stringBuffer.append('}');
            PrintStream printStream = System.out;
            printStream.println("domChildren[" + ssaBasicBlock + "]: " + ((Object) stringBuffer));
        }
    }

    public DomInfo[] run() {
        int size = this.nodes.size();
        Dominators.make(this.meth, this.domInfos, false);
        buildDomTree();
        for (int i4 = 0; i4 < size; i4++) {
            this.domInfos[i4].dominanceFrontiers = SetFactory.makeDomFrontSet(size);
        }
        calcDomFronts();
        return this.domInfos;
    }
}
