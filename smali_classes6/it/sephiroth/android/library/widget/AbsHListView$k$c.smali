.class Lit/sephiroth/android/library/widget/AbsHListView$k$c;
.super Ljava/lang/Object;
.source "AbsHListView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lit/sephiroth/android/library/widget/AbsHListView$k;->e(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Lit/sephiroth/android/library/widget/AbsHListView$k;


# direct methods
.method constructor <init>(Lit/sephiroth/android/library/widget/AbsHListView$k;III)V
    .locals 0

    .line 1
    iput-object p1, p0, Lit/sephiroth/android/library/widget/AbsHListView$k$c;->e:Lit/sephiroth/android/library/widget/AbsHListView$k;

    iput p2, p0, Lit/sephiroth/android/library/widget/AbsHListView$k$c;->b:I

    iput p3, p0, Lit/sephiroth/android/library/widget/AbsHListView$k$c;->c:I

    iput p4, p0, Lit/sephiroth/android/library/widget/AbsHListView$k$c;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lit/sephiroth/android/library/widget/AbsHListView$k$c;->e:Lit/sephiroth/android/library/widget/AbsHListView$k;

    iget v1, p0, Lit/sephiroth/android/library/widget/AbsHListView$k$c;->b:I

    iget v2, p0, Lit/sephiroth/android/library/widget/AbsHListView$k$c;->c:I

    iget v3, p0, Lit/sephiroth/android/library/widget/AbsHListView$k$c;->d:I

    invoke-virtual {v0, v1, v2, v3}, Lit/sephiroth/android/library/widget/AbsHListView$k;->e(III)V

    return-void
.end method
