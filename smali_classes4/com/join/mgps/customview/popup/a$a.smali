.class Lcom/join/mgps/customview/popup/a$a;
.super Ljava/lang/Object;
.source "BasicPopup.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/popup/a;->w(Landroid/content/DialogInterface$OnDismissListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/DialogInterface$OnDismissListener;

.field final synthetic c:Lcom/join/mgps/customview/popup/a;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/popup/a;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popup/a$a;->c:Lcom/join/mgps/customview/popup/a;

    iput-object p2, p0, Lcom/join/mgps/customview/popup/a$a;->b:Landroid/content/DialogInterface$OnDismissListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a$a;->c:Lcom/join/mgps/customview/popup/a;

    invoke-virtual {v0, p1}, Lcom/join/mgps/customview/popup/a;->onDismiss(Landroid/content/DialogInterface;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a$a;->b:Landroid/content/DialogInterface$OnDismissListener;

    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    return-void
.end method
