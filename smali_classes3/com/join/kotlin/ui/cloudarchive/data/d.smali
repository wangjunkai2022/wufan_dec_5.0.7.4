.class public final synthetic Lcom/join/kotlin/ui/cloudarchive/data/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

.field public final synthetic c:Lcom/join/mgps/db/tables/CloudArchiveTable;

.field public final synthetic d:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;Lcom/join/mgps/db/tables/CloudArchiveTable;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/data/d;->b:Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/data/d;->c:Lcom/join/mgps/db/tables/CloudArchiveTable;

    iput-object p3, p0, Lcom/join/kotlin/ui/cloudarchive/data/d;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/data/d;->b:Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/cloudarchive/data/d;->c:Lcom/join/mgps/db/tables/CloudArchiveTable;

    iget-object v2, p0, Lcom/join/kotlin/ui/cloudarchive/data/d;->d:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;->b(Lcom/join/kotlin/ui/cloudarchive/data/ModDataRequest;Lcom/join/mgps/db/tables/CloudArchiveTable;Landroid/content/Context;)V

    return-void
.end method
