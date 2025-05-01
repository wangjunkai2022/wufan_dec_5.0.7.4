.class Lcom/join/mgps/dialog/u0$b;
.super Ljava/lang/Object;
.source "FightWifiErrorDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/u0;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dialog/u0;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/u0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/u0$b;->b:Lcom/join/mgps/dialog/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/u0$b;->b:Lcom/join/mgps/dialog/u0;

    iget-object p1, p1, Lcom/join/mgps/dialog/u0;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/dialog/u0$b;->b:Lcom/join/mgps/dialog/u0;

    invoke-virtual {p1}, Landroid/app/AlertDialog;->dismiss()V

    return-void
.end method
