.class Lcom/join/mgps/dialog/f0$c;
.super Ljava/lang/Object;
.source "DialogExit.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/f0;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dialog/f0;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/f0$c;->b:Lcom/join/mgps/dialog/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/f0$c;->b:Lcom/join/mgps/dialog/f0;

    invoke-static {p1}, Lcom/join/mgps/dialog/f0;->c(Lcom/join/mgps/dialog/f0;)Lcom/join/mgps/dialog/f0$d;

    move-result-object p1

    invoke-interface {p1}, Lcom/join/mgps/dialog/f0$d;->a()V

    return-void
.end method
