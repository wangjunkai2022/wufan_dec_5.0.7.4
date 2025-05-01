.class Lcom/join/mgps/dialog/e0$a;
.super Ljava/lang/Object;
.source "CreateEndGameGuideDialog.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/e0;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/dialog/e0;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/e0$a;->a:Lcom/join/mgps/dialog/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/e0$a;->a:Lcom/join/mgps/dialog/e0;

    iget-object p1, p1, Lcom/join/mgps/dialog/e0;->h:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->showGuideCreateEndGame()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p1

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    return-void
.end method
