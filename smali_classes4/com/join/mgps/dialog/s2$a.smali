.class Lcom/join/mgps/dialog/s2$a;
.super Ljava/lang/Object;
.source "WifiFightMismatchDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/s2;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dialog/s2;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/s2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/s2$a;->b:Lcom/join/mgps/dialog/s2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/s2$a;->b:Lcom/join/mgps/dialog/s2;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
