package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.shadow.ShadowRenderer;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ShapePath {
    protected static final float ANGLE_LEFT = 180.0f;
    private static final float ANGLE_UP = 270.0f;
    private boolean containsIncompatibleShadowOp;
    @Deprecated
    public float currentShadowAngle;
    @Deprecated
    public float endShadowAngle;
    @Deprecated
    public float endX;
    @Deprecated
    public float endY;
    private final List<PathOperation> operations = new ArrayList();
    private final List<ShadowCompatOperation> shadowCompatOperations = new ArrayList();
    @Deprecated
    public float startX;
    @Deprecated
    public float startY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ArcShadowOperation extends ShadowCompatOperation {
        private final PathArcOperation operation;

        public ArcShadowOperation(PathArcOperation pathArcOperation) {
            this.operation = pathArcOperation;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i4, @NonNull Canvas canvas) {
            shadowRenderer.drawCornerShadow(canvas, matrix, new RectF(this.operation.getLeft(), this.operation.getTop(), this.operation.getRight(), this.operation.getBottom()), i4, this.operation.getStartAngle(), this.operation.getSweepAngle());
        }
    }

    /* loaded from: classes3.dex */
    static class LineShadowOperation extends ShadowCompatOperation {
        private final PathLineOperation operation;
        private final float startX;
        private final float startY;

        public LineShadowOperation(PathLineOperation pathLineOperation, float f5, float f6) {
            this.operation = pathLineOperation;
            this.startX = f5;
            this.startY = f6;
        }

        @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
        public void draw(Matrix matrix, @NonNull ShadowRenderer shadowRenderer, int i4, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.operation.f13135y - this.startY, this.operation.f13134x - this.startX), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.startX, this.startY);
            matrix2.preRotate(getAngle());
            shadowRenderer.drawEdgeShadow(canvas, matrix2, rectF, i4);
        }

        float getAngle() {
            return (float) Math.toDegrees(Math.atan((this.operation.f13135y - this.startY) / (this.operation.f13134x - this.startX)));
        }
    }

    /* loaded from: classes3.dex */
    public static class PathArcOperation extends PathOperation {
        private static final RectF rectF = new RectF();
        @Deprecated
        public float bottom;
        @Deprecated
        public float left;
        @Deprecated
        public float right;
        @Deprecated
        public float startAngle;
        @Deprecated
        public float sweepAngle;
        @Deprecated
        public float top;

        public PathArcOperation(float f5, float f6, float f7, float f8) {
            setLeft(f5);
            setTop(f6);
            setRight(f7);
            setBottom(f8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getBottom() {
            return this.bottom;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getLeft() {
            return this.left;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getRight() {
            return this.right;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getStartAngle() {
            return this.startAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getSweepAngle() {
            return this.sweepAngle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float getTop() {
            return this.top;
        }

        private void setBottom(float f5) {
            this.bottom = f5;
        }

        private void setLeft(float f5) {
            this.left = f5;
        }

        private void setRight(float f5) {
            this.right = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartAngle(float f5) {
            this.startAngle = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSweepAngle(float f5) {
            this.sweepAngle = f5;
        }

        private void setTop(float f5) {
            this.top = f5;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF2 = rectF;
            rectF2.set(getLeft(), getTop(), getRight(), getBottom());
            path.arcTo(rectF2, getStartAngle(), getSweepAngle(), false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public static class PathCubicOperation extends PathOperation {
        private float controlX1;
        private float controlX2;
        private float controlY1;
        private float controlY2;
        private float endX;
        private float endY;

        public PathCubicOperation(float f5, float f6, float f7, float f8, float f9, float f10) {
            setControlX1(f5);
            setControlY1(f6);
            setControlX2(f7);
            setControlY2(f8);
            setEndX(f9);
            setEndY(f10);
        }

        private float getControlX1() {
            return this.controlX1;
        }

        private float getControlX2() {
            return this.controlX2;
        }

        private float getControlY1() {
            return this.controlY1;
        }

        private float getControlY2() {
            return this.controlY1;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        private void setControlX1(float f5) {
            this.controlX1 = f5;
        }

        private void setControlX2(float f5) {
            this.controlX2 = f5;
        }

        private void setControlY1(float f5) {
            this.controlY1 = f5;
        }

        private void setControlY2(float f5) {
            this.controlY2 = f5;
        }

        private void setEndX(float f5) {
            this.endX = f5;
        }

        private void setEndY(float f5) {
            this.endY = f5;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.cubicTo(this.controlX1, this.controlY1, this.controlX2, this.controlY2, this.endX, this.endY);
            path.transform(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public static class PathLineOperation extends PathOperation {

        /* renamed from: x  reason: collision with root package name */
        private float f13134x;

        /* renamed from: y  reason: collision with root package name */
        private float f13135y;

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f13134x, this.f13135y);
            path.transform(matrix);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class PathOperation {
        protected final Matrix matrix = new Matrix();

        public abstract void applyToPath(Matrix matrix, Path path);
    }

    /* loaded from: classes3.dex */
    public static class PathQuadOperation extends PathOperation {
        @Deprecated
        public float controlX;
        @Deprecated
        public float controlY;
        @Deprecated
        public float endX;
        @Deprecated
        public float endY;

        private float getControlX() {
            return this.controlX;
        }

        private float getControlY() {
            return this.controlY;
        }

        private float getEndX() {
            return this.endX;
        }

        private float getEndY() {
            return this.endY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlX(float f5) {
            this.controlX = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setControlY(float f5) {
            this.controlY = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndX(float f5) {
            this.endX = f5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndY(float f5) {
            this.endY = f5;
        }

        @Override // com.google.android.material.shape.ShapePath.PathOperation
        public void applyToPath(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.matrix;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.quadTo(getControlX(), getControlY(), getEndX(), getEndY());
            path.transform(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class ShadowCompatOperation {
        static final Matrix IDENTITY_MATRIX = new Matrix();

        ShadowCompatOperation() {
        }

        public abstract void draw(Matrix matrix, ShadowRenderer shadowRenderer, int i4, Canvas canvas);

        public final void draw(ShadowRenderer shadowRenderer, int i4, Canvas canvas) {
            draw(IDENTITY_MATRIX, shadowRenderer, i4, canvas);
        }
    }

    public ShapePath() {
        reset(0.0f, 0.0f);
    }

    private void addConnectingShadowIfNecessary(float f5) {
        if (getCurrentShadowAngle() == f5) {
            return;
        }
        float currentShadowAngle = ((f5 - getCurrentShadowAngle()) + 360.0f) % 360.0f;
        if (currentShadowAngle > ANGLE_LEFT) {
            return;
        }
        PathArcOperation pathArcOperation = new PathArcOperation(getEndX(), getEndY(), getEndX(), getEndY());
        pathArcOperation.setStartAngle(getCurrentShadowAngle());
        pathArcOperation.setSweepAngle(currentShadowAngle);
        this.shadowCompatOperations.add(new ArcShadowOperation(pathArcOperation));
        setCurrentShadowAngle(f5);
    }

    private void addShadowCompatOperation(ShadowCompatOperation shadowCompatOperation, float f5, float f6) {
        addConnectingShadowIfNecessary(f5);
        this.shadowCompatOperations.add(shadowCompatOperation);
        setCurrentShadowAngle(f6);
    }

    private float getCurrentShadowAngle() {
        return this.currentShadowAngle;
    }

    private float getEndShadowAngle() {
        return this.endShadowAngle;
    }

    private void setCurrentShadowAngle(float f5) {
        this.currentShadowAngle = f5;
    }

    private void setEndShadowAngle(float f5) {
        this.endShadowAngle = f5;
    }

    private void setEndX(float f5) {
        this.endX = f5;
    }

    private void setEndY(float f5) {
        this.endY = f5;
    }

    private void setStartX(float f5) {
        this.startX = f5;
    }

    private void setStartY(float f5) {
        this.startY = f5;
    }

    public void addArc(float f5, float f6, float f7, float f8, float f9, float f10) {
        PathArcOperation pathArcOperation = new PathArcOperation(f5, f6, f7, f8);
        pathArcOperation.setStartAngle(f9);
        pathArcOperation.setSweepAngle(f10);
        this.operations.add(pathArcOperation);
        ArcShadowOperation arcShadowOperation = new ArcShadowOperation(pathArcOperation);
        float f11 = f9 + f10;
        boolean z4 = f10 < 0.0f;
        if (z4) {
            f9 = (f9 + ANGLE_LEFT) % 360.0f;
        }
        addShadowCompatOperation(arcShadowOperation, f9, z4 ? (ANGLE_LEFT + f11) % 360.0f : f11);
        double d5 = f11;
        setEndX(((f5 + f7) * 0.5f) + (((f7 - f5) / 2.0f) * ((float) Math.cos(Math.toRadians(d5)))));
        setEndY(((f6 + f8) * 0.5f) + (((f8 - f6) / 2.0f) * ((float) Math.sin(Math.toRadians(d5)))));
    }

    public void applyToPath(Matrix matrix, Path path) {
        int size = this.operations.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.operations.get(i4).applyToPath(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean containsIncompatibleShadowOp() {
        return this.containsIncompatibleShadowOp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ShadowCompatOperation createShadowCompatOperation(Matrix matrix) {
        addConnectingShadowIfNecessary(getEndShadowAngle());
        final Matrix matrix2 = new Matrix(matrix);
        final ArrayList arrayList = new ArrayList(this.shadowCompatOperations);
        return new ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
            @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
            public void draw(Matrix matrix3, ShadowRenderer shadowRenderer, int i4, Canvas canvas) {
                for (ShadowCompatOperation shadowCompatOperation : arrayList) {
                    shadowCompatOperation.draw(matrix2, shadowRenderer, i4, canvas);
                }
            }
        };
    }

    @RequiresApi(21)
    public void cubicToPoint(float f5, float f6, float f7, float f8, float f9, float f10) {
        this.operations.add(new PathCubicOperation(f5, f6, f7, f8, f9, f10));
        this.containsIncompatibleShadowOp = true;
        setEndX(f9);
        setEndY(f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getEndX() {
        return this.endX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getEndY() {
        return this.endY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getStartX() {
        return this.startX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float getStartY() {
        return this.startY;
    }

    public void lineTo(float f5, float f6) {
        PathLineOperation pathLineOperation = new PathLineOperation();
        pathLineOperation.f13134x = f5;
        pathLineOperation.f13135y = f6;
        this.operations.add(pathLineOperation);
        LineShadowOperation lineShadowOperation = new LineShadowOperation(pathLineOperation, getEndX(), getEndY());
        addShadowCompatOperation(lineShadowOperation, lineShadowOperation.getAngle() + ANGLE_UP, lineShadowOperation.getAngle() + ANGLE_UP);
        setEndX(f5);
        setEndY(f6);
    }

    @RequiresApi(21)
    public void quadToPoint(float f5, float f6, float f7, float f8) {
        PathQuadOperation pathQuadOperation = new PathQuadOperation();
        pathQuadOperation.setControlX(f5);
        pathQuadOperation.setControlY(f6);
        pathQuadOperation.setEndX(f7);
        pathQuadOperation.setEndY(f8);
        this.operations.add(pathQuadOperation);
        this.containsIncompatibleShadowOp = true;
        setEndX(f7);
        setEndY(f8);
    }

    public void reset(float f5, float f6) {
        reset(f5, f6, ANGLE_UP, 0.0f);
    }

    public void reset(float f5, float f6, float f7, float f8) {
        setStartX(f5);
        setStartY(f6);
        setEndX(f5);
        setEndY(f6);
        setCurrentShadowAngle(f7);
        setEndShadowAngle((f7 + f8) % 360.0f);
        this.operations.clear();
        this.shadowCompatOperations.clear();
        this.containsIncompatibleShadowOp = false;
    }

    public ShapePath(float f5, float f6) {
        reset(f5, f6);
    }
}
