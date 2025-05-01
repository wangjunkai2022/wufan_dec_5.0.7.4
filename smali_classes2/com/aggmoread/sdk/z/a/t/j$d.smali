.class Lcom/aggmoread/sdk/z/a/t/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/t/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/t/j;->a(Landroid/content/Context;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/t/j;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/t/j;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/j$d;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/j$d;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/j;->d(Lcom/aggmoread/sdk/z/a/t/j;)V

    return-void
.end method

.method public a(J)V
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/j$d;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/j;->e(Lcom/aggmoread/sdk/z/a/t/j;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/j$d;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/j;->e(Lcom/aggmoread/sdk/z/a/t/j;)Landroid/widget/TextView;

    move-result-object v0

    const/high16 v1, 0x41900000    # 18.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/j$d;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/t/j;->e(Lcom/aggmoread/sdk/z/a/t/j;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "\u5173\u95ed"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const-wide/16 v0, 0x258

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/t/j$d;->a:Lcom/aggmoread/sdk/z/a/t/j;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/t/j;->d(Lcom/aggmoread/sdk/z/a/t/j;)V

    :cond_1
    return-void
.end method
