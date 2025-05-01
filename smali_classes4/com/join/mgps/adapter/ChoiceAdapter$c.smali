.class Lcom/join/mgps/adapter/ChoiceAdapter$c;
.super Ljava/lang/Object;
.source "ChoiceAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/ChoiceAdapter;->w(Lcom/join/mgps/adapter/ChoiceAdapter$OrderTopVH;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/adapter/ChoiceAdapter$p;

.field final synthetic c:Lcom/join/mgps/adapter/ChoiceAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/ChoiceAdapter;Lcom/join/mgps/adapter/ChoiceAdapter$p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$c;->c:Lcom/join/mgps/adapter/ChoiceAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/ChoiceAdapter$c;->b:Lcom/join/mgps/adapter/ChoiceAdapter$p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/ChoiceAdapter$c;->c:Lcom/join/mgps/adapter/ChoiceAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/ChoiceAdapter;->a(Lcom/join/mgps/adapter/ChoiceAdapter;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/ChoiceAdapter$c;->b:Lcom/join/mgps/adapter/ChoiceAdapter$p;

    invoke-virtual {v1}, Lcom/join/mgps/adapter/ChoiceAdapter$p;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->goShareWebActivity(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
