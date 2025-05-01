package androidx.constraintlayout.core;

import androidx.constraintlayout.core.ArrayRow;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public class PriorityGoalRow extends ArrayRow {
    private static final boolean DEBUG = false;
    static final int NOT_FOUND = -1;
    private static final float epsilon = 1.0E-4f;
    private int TABLE_SIZE;
    GoalVariableAccessor accessor;
    private SolverVariable[] arrayGoals;
    Cache mCache;
    private int numGoals;
    private SolverVariable[] sortArray;

    /* loaded from: classes.dex */
    class GoalVariableAccessor {
        PriorityGoalRow row;
        SolverVariable variable;

        public GoalVariableAccessor(PriorityGoalRow priorityGoalRow) {
            this.row = priorityGoalRow;
        }

        public void add(SolverVariable solverVariable) {
            for (int i4 = 0; i4 < 9; i4++) {
                float[] fArr = this.variable.goalStrengthVector;
                fArr[i4] = fArr[i4] + solverVariable.goalStrengthVector[i4];
                if (Math.abs(fArr[i4]) < 1.0E-4f) {
                    this.variable.goalStrengthVector[i4] = 0.0f;
                }
            }
        }

        public boolean addToGoal(SolverVariable solverVariable, float f5) {
            boolean z4 = true;
            if (!this.variable.inGoal) {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f6 = solverVariable.goalStrengthVector[i4];
                    if (f6 != 0.0f) {
                        float f7 = f6 * f5;
                        if (Math.abs(f7) < 1.0E-4f) {
                            f7 = 0.0f;
                        }
                        this.variable.goalStrengthVector[i4] = f7;
                    } else {
                        this.variable.goalStrengthVector[i4] = 0.0f;
                    }
                }
                return true;
            }
            for (int i5 = 0; i5 < 9; i5++) {
                float[] fArr = this.variable.goalStrengthVector;
                fArr[i5] = fArr[i5] + (solverVariable.goalStrengthVector[i5] * f5);
                if (Math.abs(fArr[i5]) < 1.0E-4f) {
                    this.variable.goalStrengthVector[i5] = 0.0f;
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                PriorityGoalRow.this.removeGoal(this.variable);
            }
            return false;
        }

        public void init(SolverVariable solverVariable) {
            this.variable = solverVariable;
        }

        public final boolean isNegative() {
            for (int i4 = 8; i4 >= 0; i4--) {
                float f5 = this.variable.goalStrengthVector[i4];
                if (f5 > 0.0f) {
                    return false;
                }
                if (f5 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isNull() {
            for (int i4 = 0; i4 < 9; i4++) {
                if (this.variable.goalStrengthVector[i4] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isSmallerThan(SolverVariable solverVariable) {
            int i4 = 8;
            while (true) {
                if (i4 < 0) {
                    break;
                }
                float f5 = solverVariable.goalStrengthVector[i4];
                float f6 = this.variable.goalStrengthVector[i4];
                if (f6 == f5) {
                    i4--;
                } else if (f6 < f5) {
                    return true;
                }
            }
            return false;
        }

        public void reset() {
            Arrays.fill(this.variable.goalStrengthVector, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.variable != null) {
                for (int i4 = 0; i4 < 9; i4++) {
                    str = str + this.variable.goalStrengthVector[i4] + " ";
                }
            }
            return str + "] " + this.variable;
        }
    }

    public PriorityGoalRow(Cache cache) {
        super(cache);
        this.TABLE_SIZE = 128;
        this.arrayGoals = new SolverVariable[128];
        this.sortArray = new SolverVariable[128];
        this.numGoals = 0;
        this.accessor = new GoalVariableAccessor(this);
        this.mCache = cache;
    }

    private final void addToGoal(SolverVariable solverVariable) {
        int i4;
        int i5 = this.numGoals + 1;
        SolverVariable[] solverVariableArr = this.arrayGoals;
        if (i5 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.arrayGoals = solverVariableArr2;
            this.sortArray = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.arrayGoals;
        int i6 = this.numGoals;
        solverVariableArr3[i6] = solverVariable;
        int i7 = i6 + 1;
        this.numGoals = i7;
        if (i7 > 1 && solverVariableArr3[i7 - 1].id > solverVariable.id) {
            int i8 = 0;
            while (true) {
                i4 = this.numGoals;
                if (i8 >= i4) {
                    break;
                }
                this.sortArray[i8] = this.arrayGoals[i8];
                i8++;
            }
            Arrays.sort(this.sortArray, 0, i4, new Comparator<SolverVariable>() { // from class: androidx.constraintlayout.core.PriorityGoalRow.1
                @Override // java.util.Comparator
                public int compare(SolverVariable solverVariable2, SolverVariable solverVariable3) {
                    return solverVariable2.id - solverVariable3.id;
                }
            });
            for (int i9 = 0; i9 < this.numGoals; i9++) {
                this.arrayGoals[i9] = this.sortArray[i9];
            }
        }
        solverVariable.inGoal = true;
        solverVariable.addToRow(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeGoal(SolverVariable solverVariable) {
        int i4 = 0;
        while (i4 < this.numGoals) {
            if (this.arrayGoals[i4] == solverVariable) {
                while (true) {
                    int i5 = this.numGoals;
                    if (i4 < i5 - 1) {
                        SolverVariable[] solverVariableArr = this.arrayGoals;
                        int i6 = i4 + 1;
                        solverVariableArr[i4] = solverVariableArr[i6];
                        i4 = i6;
                    } else {
                        this.numGoals = i5 - 1;
                        solverVariable.inGoal = false;
                        return;
                    }
                }
            } else {
                i4++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void addError(SolverVariable solverVariable) {
        this.accessor.init(solverVariable);
        this.accessor.reset();
        solverVariable.goalStrengthVector[solverVariable.strength] = 1.0f;
        addToGoal(solverVariable);
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void clear() {
        this.numGoals = 0;
        this.constantValue = 0.0f;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public SolverVariable getPivotCandidate(LinearSystem linearSystem, boolean[] zArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < this.numGoals; i5++) {
            SolverVariable solverVariable = this.arrayGoals[i5];
            if (!zArr[solverVariable.id]) {
                this.accessor.init(solverVariable);
                if (i4 == -1) {
                    if (!this.accessor.isNegative()) {
                    }
                    i4 = i5;
                } else {
                    if (!this.accessor.isSmallerThan(this.arrayGoals[i4])) {
                    }
                    i4 = i5;
                }
            }
        }
        if (i4 == -1) {
            return null;
        }
        return this.arrayGoals[i4];
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public boolean isEmpty() {
        return this.numGoals == 0;
    }

    @Override // androidx.constraintlayout.core.ArrayRow
    public String toString() {
        String str = " goal -> (" + this.constantValue + ") : ";
        for (int i4 = 0; i4 < this.numGoals; i4++) {
            this.accessor.init(this.arrayGoals[i4]);
            str = str + this.accessor + " ";
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.ArrayRow, androidx.constraintlayout.core.LinearSystem.Row
    public void updateFromRow(LinearSystem linearSystem, ArrayRow arrayRow, boolean z4) {
        SolverVariable solverVariable = arrayRow.variable;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.ArrayRowVariables arrayRowVariables = arrayRow.variables;
        int currentSize = arrayRowVariables.getCurrentSize();
        for (int i4 = 0; i4 < currentSize; i4++) {
            SolverVariable variable = arrayRowVariables.getVariable(i4);
            float variableValue = arrayRowVariables.getVariableValue(i4);
            this.accessor.init(variable);
            if (this.accessor.addToGoal(solverVariable, variableValue)) {
                addToGoal(variable);
            }
            this.constantValue += arrayRow.constantValue * variableValue;
        }
        removeGoal(solverVariable);
    }
}
