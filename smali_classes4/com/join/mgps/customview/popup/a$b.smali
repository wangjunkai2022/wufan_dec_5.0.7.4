.class Lcom/join/mgps/customview/popup/a$b;
.super Ljava/lang/Object;
.source "BasicPopup.java"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/popup/a;->x(Landroid/content/DialogInterface$OnKeyListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/DialogInterface$OnKeyListener;

.field final synthetic c:Lcom/join/mgps/customview/popup/a;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/popup/a;Landroid/content/DialogInterface$OnKeyListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popup/a$b;->c:Lcom/join/mgps/customview/popup/a;

    iput-object p2, p0, Lcom/join/mgps/customview/popup/a$b;->b:Landroid/content/DialogInterface$OnKeyListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a$b;->c:Lcom/join/mgps/customview/popup/a;

    invoke-virtual {v0, p1, p2, p3}, Lcom/join/mgps/customview/popup/a;->onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    .line 2
    iget-object v0, p0, Lcom/join/mgps/customview/popup/a$b;->b:Landroid/content/DialogInterface$OnKeyListener;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/DialogInterface$OnKeyListener;->onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
