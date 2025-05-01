.class Lcom/join/mgps/customview/popup/b$a;
.super Ljava/lang/Object;
.source "ConfirmPopup.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/popup/b;->I()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/popup/b;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/popup/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/popup/b$a;->b:Lcom/join/mgps/customview/popup/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/popup/b$a;->b:Lcom/join/mgps/customview/popup/b;

    invoke-virtual {p1}, Lcom/join/mgps/customview/popup/a;->a()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/popup/b$a;->b:Lcom/join/mgps/customview/popup/b;

    invoke-virtual {p1}, Lcom/join/mgps/customview/popup/b;->J()V

    return-void
.end method
