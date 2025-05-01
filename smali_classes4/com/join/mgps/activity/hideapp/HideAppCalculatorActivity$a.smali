.class Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$a;
.super Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;
.source "HideAppCalculatorActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->o0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;-><init>()V

    return-void
.end method


# virtual methods
.method public getSpanSize(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->f0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->f0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$a;->a:Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;->f0(Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/activity/hideapp/HideAppCalculatorActivity$d;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "0"

    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
