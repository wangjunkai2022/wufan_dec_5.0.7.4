.class Lcom/join/mgps/Util/a0$z;
.super Ljava/lang/Object;
.source "DialogUtil.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/Util/a0;->b0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/o;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Lcom/join/mgps/Util/a0;


# direct methods
.method constructor <init>(Lcom/join/mgps/Util/a0;Lcom/join/mgps/customview/o;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/Util/a0$z;->f:Lcom/join/mgps/Util/a0;

    iput-object p2, p0, Lcom/join/mgps/Util/a0$z;->b:Lcom/join/mgps/customview/o;

    iput-object p3, p0, Lcom/join/mgps/Util/a0$z;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/join/mgps/Util/a0$z;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/join/mgps/Util/a0$z;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/Util/a0$z;->b:Lcom/join/mgps/customview/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/Util/a0$z;->b:Lcom/join/mgps/customview/o;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/Util/a0$z;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/APKUtils;->I(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p1

    const-string/jumbo v0, "\u5df2\u590d\u5236Q\u7fa4\u53f7\uff0c\u82e5\u672a\u80fd\u8df3\u8f6c\u8bf7\u81ea\u884c\u6253\u5f00qq\u7c98\u8d34\u7fa4\u53f7"

    if-eqz p1, :cond_1

    .line 4
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/Util/a0$z;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/Util/a0$z;->d:Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Lcom/join/mgps/Util/IntentUtil;->goQQGroup(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/Util/a0$z;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/Util/a0$z;->e:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/join/mgps/Util/j0;->M(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/Util/a0$z;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/Util/a0$z;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/join/mgps/Util/a0$z;->e:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/join/mgps/Util/j0;->M(Landroid/content/Context;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/Util/a0$z;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
