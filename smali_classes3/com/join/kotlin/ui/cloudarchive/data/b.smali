.class public final synthetic Lcom/join/kotlin/ui/cloudarchive/data/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/kotlin/ui/cloudarchive/data/EmusDataRequest;

.field public final synthetic c:Lcom/join/mgps/db/tables/CloudArchiveTable;

.field public final synthetic d:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/join/kotlin/ui/cloudarchive/data/EmusDataRequest;Lcom/join/mgps/db/tables/CloudArchiveTable;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/data/b;->b:Lcom/join/kotlin/ui/cloudarchive/data/EmusDataRequest;

    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/data/b;->c:Lcom/join/mgps/db/tables/CloudArchiveTable;

    iput-object p3, p0, Lcom/join/kotlin/ui/cloudarchive/data/b;->d:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/data/b;->b:Lcom/join/kotlin/ui/cloudarchive/data/EmusDataRequest;

    iget-object v1, p0, Lcom/join/kotlin/ui/cloudarchive/data/b;->c:Lcom/join/mgps/db/tables/CloudArchiveTable;

    iget-object v2, p0, Lcom/join/kotlin/ui/cloudarchive/data/b;->d:Landroid/content/Context;

    invoke-static {v0, v1, v2}, Lcom/join/kotlin/ui/cloudarchive/data/EmusDataRequest;->b(Lcom/join/kotlin/ui/cloudarchive/data/EmusDataRequest;Lcom/join/mgps/db/tables/CloudArchiveTable;Landroid/content/Context;)V

    return-void
.end method
