.class public final synthetic Lcom/join/mgps/dialog/i0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/dialog/DownloadMethodMultiDialog;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/dialog/DownloadMethodMultiDialog;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/dialog/i0;->b:Lcom/join/mgps/dialog/DownloadMethodMultiDialog;

    iput-object p2, p0, Lcom/join/mgps/dialog/i0;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/dialog/i0;->b:Lcom/join/mgps/dialog/DownloadMethodMultiDialog;

    iget-object v1, p0, Lcom/join/mgps/dialog/i0;->c:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/dialog/DownloadMethodMultiDialog;->g0(Lcom/join/mgps/dialog/DownloadMethodMultiDialog;Ljava/util/List;Landroid/view/View;)V

    return-void
.end method
