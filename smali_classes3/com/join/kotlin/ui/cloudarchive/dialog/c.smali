.class public final synthetic Lcom/join/kotlin/ui/cloudarchive/dialog/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/c;->a:Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/dialog/c;->a:Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;->X(Lcom/join/kotlin/ui/cloudarchive/dialog/DownloadArchiveDialog;Ljava/lang/String;)V

    return-void
.end method
