.class Lcom/join/mgps/dialog/n$c;
.super Ljava/lang/Object;
.source "ArenaRoomTypeDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/n;->c(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dialog/n;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/n$c;->b:Lcom/join/mgps/dialog/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/n$c;->b:Lcom/join/mgps/dialog/n;

    invoke-static {p1}, Lcom/join/mgps/dialog/n;->a(Lcom/join/mgps/dialog/n;)Lcom/join/mgps/dialog/n$d;

    move-result-object p1

    invoke-interface {p1}, Lcom/join/mgps/dialog/n$d;->b()V

    return-void
.end method
