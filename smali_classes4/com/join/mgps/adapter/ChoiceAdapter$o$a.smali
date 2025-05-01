.class Lcom/join/mgps/adapter/ChoiceAdapter$o$a;
.super Ljava/lang/Object;
.source "ChoiceAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ChoiceAdapter$o;->a(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/ChoiceAdapter$o;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ChoiceAdapter$o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$o$a;->b:Lcom/join/mgps/adapter/ChoiceAdapter$o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$o$a;->b:Lcom/join/mgps/adapter/ChoiceAdapter$o;

    iget-object p1, p1, Lcom/join/mgps/adapter/ChoiceAdapter$o;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/SimulatorAreaActivity_;->A0(Landroid/content/Context;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/ChoiceAdapter$o$a;->b:Lcom/join/mgps/adapter/ChoiceAdapter$o;

    iget-object v0, v0, Lcom/join/mgps/adapter/ChoiceAdapter$o;->b:Lcom/join/mgps/dto/TodayWufunEmuClassify;

    invoke-virtual {v0}, Lcom/join/mgps/dto/TodayWufunEmuClassify;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->b(I)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/ChoiceAdapter$o$a;->b:Lcom/join/mgps/adapter/ChoiceAdapter$o;

    iget-object v0, v0, Lcom/join/mgps/adapter/ChoiceAdapter$o;->b:Lcom/join/mgps/dto/TodayWufunEmuClassify;

    invoke-virtual {v0}, Lcom/join/mgps/dto/TodayWufunEmuClassify;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/SimulatorAreaActivity_$n;->a(Ljava/lang/String;)Lcom/join/mgps/activity/SimulatorAreaActivity_$n;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method
