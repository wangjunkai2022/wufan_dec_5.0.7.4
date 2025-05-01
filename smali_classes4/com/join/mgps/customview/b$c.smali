.class Lcom/join/mgps/customview/b$c;
.super Ljava/lang/Object;
.source "ForumExtFuncPopWindow.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/b;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/customview/b;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/b$c;->b:Lcom/join/mgps/customview/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/customview/b$c;->b:Lcom/join/mgps/customview/b;

    invoke-static {p1}, Lcom/join/mgps/customview/b;->b(Lcom/join/mgps/customview/b;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/customview/b$c;->b:Lcom/join/mgps/customview/b;

    invoke-static {p1}, Lcom/join/mgps/customview/b;->a(Lcom/join/mgps/customview/b;)Lcom/join/mgps/dialog/v0;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
