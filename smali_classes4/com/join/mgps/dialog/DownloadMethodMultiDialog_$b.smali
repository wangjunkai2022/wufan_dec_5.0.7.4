.class Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$b;
.super Ljava/lang/Object;
.source "DownloadMethodMultiDialog_.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;->onViewChanged(La4/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;


# direct methods
.method constructor <init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$b;->b:Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/dialog/DownloadMethodMultiDialog_$b;->b:Lcom/join/mgps/dialog/DownloadMethodMultiDialog_;

    invoke-virtual {p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->close()V

    return-void
.end method
