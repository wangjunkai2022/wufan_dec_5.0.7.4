.class public final synthetic Lcom/join/mgps/adapter/z5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/z5;->b:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;

    iput-object p2, p0, Lcom/join/mgps/adapter/z5;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/adapter/z5;->b:Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;

    iget-object v1, p0, Lcom/join/mgps/adapter/z5;->c:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter;->d(Lcom/join/mgps/adapter/SimulatorFastEntryHomeAdapter$g;Ljava/util/List;)V

    return-void
.end method
