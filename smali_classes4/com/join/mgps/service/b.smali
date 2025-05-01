.class public final synthetic Lcom/join/mgps/service/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/mgps/service/CommonService;

.field public final synthetic c:Ljava/util/LinkedHashMap;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/service/CommonService;Ljava/util/LinkedHashMap;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/service/b;->b:Lcom/join/mgps/service/CommonService;

    iput-object p2, p0, Lcom/join/mgps/service/b;->c:Ljava/util/LinkedHashMap;

    iput-object p3, p0, Lcom/join/mgps/service/b;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/join/mgps/service/b;->b:Lcom/join/mgps/service/CommonService;

    iget-object v1, p0, Lcom/join/mgps/service/b;->c:Ljava/util/LinkedHashMap;

    iget-object v2, p0, Lcom/join/mgps/service/b;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/join/mgps/service/CommonService;->b(Lcom/join/mgps/service/CommonService;Ljava/util/LinkedHashMap;Ljava/lang/String;)V

    return-void
.end method
