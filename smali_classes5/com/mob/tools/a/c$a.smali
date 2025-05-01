.class Lcom/mob/tools/a/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mob/tools/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static a:J

.field private static b:J

.field private static c:J

.field private static d:J

.field private static e:J

.field private static f:J

.field private static g:J

.field private static h:J

.field private static i:J

.field private static j:J

.field private static k:J

.field private static l:J

.field private static m:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static varargs declared-synchronized a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-class v0, Lcom/mob/tools/a/c$a;

    monitor-enter v0

    .line 111
    :try_start_0
    invoke-static {}, Lcom/mob/tools/a/c$a;->b()Z

    move-result v1

    .line 112
    sget-boolean v2, Lcom/mob/tools/a/c$a;->m:Z

    if-eqz v2, :cond_5

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    .line 113
    const-class v2, Lcom/mob/tools/a/c$b$e;

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    .line 114
    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    .line 115
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v7

    const-class v8, Ljava/lang/Object;

    if-ne v7, v8, :cond_0

    move-object v1, v6

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v1, :cond_4

    const/4 v2, 0x1

    .line 116
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 117
    sget-wide v2, Lcom/mob/tools/a/c$a;->e:J

    invoke-static {p0, v2, v3}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;J)J

    move-result-wide v2

    const-wide/16 v5, 0x0

    cmp-long p0, v2, v5

    if-eqz p0, :cond_3

    .line 118
    invoke-static {v2, v3}, Lcom/mob/tools/a/c$c;->a(J)I

    move-result p0

    :goto_2
    if-ge v4, p0, :cond_3

    int-to-long v5, v4

    .line 119
    sget-wide v7, Lcom/mob/tools/a/c$a;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {v5, v6}, Ljava/lang/Long;->signum(J)I

    mul-long v5, v5, v7

    add-long/2addr v5, v2

    :try_start_1
    sget-wide v7, Lcom/mob/tools/a/c$a;->j:J

    add-long/2addr v5, v7

    .line 120
    sget-wide v7, Lcom/mob/tools/a/c$a;->a:J

    invoke-static {v1, v7, v8, v5, v6}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;JJ)V

    .line 121
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 122
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    .line 123
    invoke-static {v5, p3}, Lcom/mob/tools/a/c$a;->a([Ljava/lang/Class;[Ljava/lang/Object;)Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v5, :cond_2

    .line 124
    :try_start_2
    invoke-virtual {v1, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 125
    invoke-static {}, Lcom/mob/tools/a/c$a;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    monitor-exit v0

    return-object v5

    :catchall_0
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 127
    :cond_3
    :try_start_3
    invoke-static {}, Lcom/mob/tools/a/c$a;->c()V

    .line 128
    new-instance p0, Ljava/lang/NoSuchMethodException;

    const-string p1, "n2"

    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 129
    :cond_4
    new-instance p0, Ljava/lang/Throwable;

    const-string p1, "x22"

    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p0

    .line 130
    :cond_5
    new-instance p0, Ljava/lang/Throwable;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "x2 "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean p2, Lcom/mob/tools/a/c$a;->m:Z

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, "|"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p0

    monitor-exit v0

    goto :goto_4

    :goto_3
    throw p0

    :goto_4
    goto :goto_3
.end method

.method public static declared-synchronized a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-class v0, Lcom/mob/tools/a/c$a;

    monitor-enter v0

    .line 132
    :try_start_0
    invoke-static {}, Lcom/mob/tools/a/c$a;->b()Z

    move-result v1

    .line 133
    sget-boolean v2, Lcom/mob/tools/a/c$a;->m:Z

    if-eqz v2, :cond_8

    if-eqz v1, :cond_8

    .line 134
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-lt v1, v2, :cond_7

    .line 135
    const-class v1, Lcom/mob/tools/a/c$b$h;

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    .line 136
    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x0

    const/4 v6, 0x1

    if-ge v4, v2, :cond_2

    aget-object v7, v1, v4

    .line 137
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_1

    if-nez p2, :cond_0

    .line 138
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v8

    and-int/lit8 v8, v8, 0x8

    if-nez v8, :cond_0

    goto :goto_1

    .line 139
    :cond_0
    invoke-virtual {v7, v6}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 140
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectGetter(Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;

    move-result-object v1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move-object v1, v5

    :goto_2
    if-eqz v1, :cond_6

    if-nez p2, :cond_3

    .line 141
    sget-wide v7, Lcom/mob/tools/a/c$a;->g:J

    goto :goto_3

    :cond_3
    sget-wide v7, Lcom/mob/tools/a/c$a;->f:J

    :goto_3
    invoke-static {p0, v7, v8}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;J)J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long p0, v7, v9

    if-eqz p0, :cond_5

    .line 142
    invoke-static {v7, v8}, Lcom/mob/tools/a/c$c;->a(J)I

    move-result p0

    const/4 v2, 0x0

    :goto_4
    if-ge v2, p0, :cond_5

    int-to-long v9, v2

    .line 143
    sget-wide v11, Lcom/mob/tools/a/c$a;->k:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    invoke-static {v9, v10}, Ljava/lang/Long;->signum(J)I

    mul-long v9, v9, v11

    add-long/2addr v9, v7

    :try_start_1
    sget-wide v11, Lcom/mob/tools/a/c$a;->l:J

    add-long/2addr v9, v11

    .line 144
    sget-wide v11, Lcom/mob/tools/a/c$a;->c:J

    invoke-static {v1, v11, v12, v9, v10}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;JJ)V

    .line 145
    sget-wide v9, Lcom/mob/tools/a/c$a;->d:J

    invoke-static {v1, v9, v10, v5}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;JLjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 146
    :try_start_2
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v4

    .line 147
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    const-string v10, "012\'bh:dKbbKdbe0djbgbhOdag"

    invoke-static {v10}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-array v11, v6, [Ljava/lang/Class;

    const-class v12, Ljava/lang/invoke/MethodHandle;

    aput-object v12, v11, v3

    invoke-virtual {v9, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    .line 148
    invoke-virtual {v9, v6}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    new-array v10, v6, [Ljava/lang/Object;

    aput-object v1, v10, v3

    .line 149
    invoke-virtual {v9, v4, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    :catchall_0
    :try_start_3
    sget-wide v9, Lcom/mob/tools/a/c$a;->d:J

    invoke-static {v1, v9, v10}, Lcom/mob/tools/a/c$c;->b(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    .line 151
    sget-wide v9, Lcom/mob/tools/a/c$a;->h:J

    invoke-static {v4, v9, v10}, Lcom/mob/tools/a/c$c;->b(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/reflect/Field;

    .line 152
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 153
    invoke-virtual {v4, v6}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 154
    :try_start_4
    invoke-virtual {v4, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 155
    invoke-static {}, Lcom/mob/tools/a/c$a;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 156
    monitor-exit v0

    return-object v4

    :catchall_1
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 157
    :cond_5
    :try_start_5
    invoke-static {}, Lcom/mob/tools/a/c$a;->c()V

    .line 158
    new-instance p0, Ljava/lang/NoSuchMethodException;

    const-string p1, "n3"

    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 159
    :cond_6
    new-instance p0, Ljava/lang/Throwable;

    const-string p1, "x34"

    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p0

    .line 160
    :cond_7
    new-instance p0, Ljava/lang/Throwable;

    const-string p1, "x33"

    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p0

    .line 161
    :cond_8
    new-instance p0, Ljava/lang/Throwable;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "x3 "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean p2, Lcom/mob/tools/a/c$a;->m:Z

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, "|"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p0

    monitor-exit v0

    goto :goto_6

    :goto_5
    throw p0

    :goto_6
    goto :goto_5
.end method

.method public static varargs declared-synchronized a(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-class v0, Lcom/mob/tools/a/c$b$e;

    const-class v1, Lcom/mob/tools/a/c$a;

    monitor-enter v1

    .line 87
    :try_start_0
    invoke-static {}, Lcom/mob/tools/a/c$a;->b()Z

    move-result v2

    .line 88
    sget-boolean v3, Lcom/mob/tools/a/c$a;->m:Z

    if-eqz v3, :cond_5

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    .line 90
    array-length v4, v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_1

    aget-object v7, v3, v6

    .line 91
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    const-class v9, Ljava/lang/Object;

    if-ne v8, v9, :cond_0

    move-object v2, v7

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v2, :cond_4

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    .line 92
    const-class v6, [Ljava/lang/Object;

    aput-object v6, v4, v5

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 93
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 94
    sget-wide v3, Lcom/mob/tools/a/c$a;->e:J

    invoke-static {p0, v3, v4}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;J)J

    move-result-wide v3

    const-wide/16 v6, 0x0

    cmp-long v8, v3, v6

    if-eqz v8, :cond_3

    .line 95
    invoke-static {v3, v4}, Lcom/mob/tools/a/c$c;->a(J)I

    move-result v6

    :goto_2
    if-ge v5, v6, :cond_3

    int-to-long v7, v5

    .line 96
    sget-wide v9, Lcom/mob/tools/a/c$a;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {v7, v8}, Ljava/lang/Long;->signum(J)I

    mul-long v7, v7, v9

    add-long/2addr v7, v3

    :try_start_1
    sget-wide v9, Lcom/mob/tools/a/c$a;->j:J

    add-long/2addr v7, v9

    .line 97
    sget-wide v9, Lcom/mob/tools/a/c$a;->a:J

    invoke-static {v2, v9, v10, v7, v8}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;JJ)V

    const-string v9, "006%gcbg c]bg\'g[ge"

    .line 98
    invoke-static {v9}, Lcom/mob/commons/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 99
    sget-wide v9, Lcom/mob/tools/a/c$a;->a:J

    invoke-static {v0, v9, v10, v7, v8}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;JJ)V

    .line 100
    sget-wide v7, Lcom/mob/tools/a/c$a;->b:J

    invoke-static {v0, v7, v8, p0}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 101
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    .line 102
    invoke-static {v7, p1}, Lcom/mob/tools/a/c$a;->a([Ljava/lang/Class;[Ljava/lang/Object;)Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v7, :cond_2

    .line 103
    :try_start_2
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 104
    invoke-static {}, Lcom/mob/tools/a/c$a;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    monitor-exit v1

    return-object v7

    :catchall_0
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 106
    :cond_3
    :try_start_3
    invoke-static {}, Lcom/mob/tools/a/c$a;->c()V

    .line 107
    new-instance p0, Ljava/lang/NoSuchMethodException;

    const-string p1, "n1"

    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 108
    :cond_4
    new-instance p0, Ljava/lang/Throwable;

    const-string p1, "x22"

    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p0

    .line 109
    :cond_5
    new-instance p0, Ljava/lang/Throwable;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "x1 "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v0, Lcom/mob/tools/a/c$a;->m:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "|"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p0

    monitor-exit v1

    goto :goto_4

    :goto_3
    throw p0

    :goto_4
    goto :goto_3
.end method

.method public static varargs declared-synchronized a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-class v0, Lcom/mob/tools/a/c$a;

    monitor-enter v0

    .line 110
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1, p2, p3}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-class v0, Lcom/mob/tools/a/c$a;

    monitor-enter v0

    .line 131
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static varargs declared-synchronized a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-class v0, Lcom/mob/tools/a/c$a;

    monitor-enter v0

    .line 86
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private static declared-synchronized a(I)V
    .locals 3

    const-class v0, Lcom/mob/tools/a/c$a;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/mob/commons/ab;->a()Lcom/mob/commons/ab;

    move-result-object v1

    const-string v2, "usf"

    invoke-virtual {v1, v2, p0}, Lcom/mob/commons/ab;->a(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized a()Z
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const-class v0, Lcom/mob/tools/a/c$b$h;

    const-class v1, Lcom/mob/tools/a/c$b$i;

    const-class v2, Lcom/mob/tools/a/c$b$b;

    const-class v3, Lcom/mob/tools/a/c$a;

    monitor-enter v3

    :try_start_0
    const-string v4, "3xu ck"

    .line 3
    invoke-static {v4}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V

    .line 4
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v5, 0x1d

    const/4 v6, 0x0

    if-ge v4, v5, :cond_0

    .line 5
    monitor-exit v3

    return v6

    .line 6
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/mob/tools/a/c$c;->a()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_23

    .line 7
    invoke-static {}, Lcom/mob/tools/a/c$a;->b()Z

    move-result v4

    if-eqz v4, :cond_22

    invoke-static {}, Lcom/mob/tools/a/c$a;->d()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v4, :cond_1

    goto/16 :goto_14

    :cond_1
    :try_start_2
    const-string v4, ""

    .line 8
    const-class v7, Lcom/mob/tools/a/c$b$c;

    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    .line 9
    array-length v8, v7

    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    .line 10
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v11

    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v11, v12, :cond_2

    .line 11
    invoke-static {v10}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v8

    sput-wide v8, Lcom/mob/tools/a/c$a;->a:J

    goto :goto_1

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 12
    :cond_3
    :goto_1
    sget-wide v8, Lcom/mob/tools/a/c$a;->a:J

    invoke-static {v4, v8, v9}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v8, :cond_4

    .line 13
    monitor-exit v3

    return v6

    .line 14
    :cond_4
    :try_start_3
    array-length v8, v7

    const/4 v9, 0x0

    :goto_2
    if-ge v9, v8, :cond_6

    aget-object v10, v7, v9

    .line 15
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v11

    if-ne v11, v2, :cond_5

    .line 16
    invoke-static {v10}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    sput-wide v7, Lcom/mob/tools/a/c$a;->b:J

    goto :goto_3

    :cond_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 17
    :cond_6
    :goto_3
    sget-wide v7, Lcom/mob/tools/a/c$a;->b:J

    invoke-static {v4, v7, v8}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v7, :cond_7

    .line 18
    monitor-exit v3

    return v6

    .line 19
    :cond_7
    :try_start_4
    const-class v7, Lcom/mob/tools/a/c$b$f;

    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    .line 20
    array-length v8, v7

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_9

    aget-object v10, v7, v9

    .line 21
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v11

    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v11, v12, :cond_8

    .line 22
    invoke-static {v10}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    sput-wide v7, Lcom/mob/tools/a/c$a;->c:J

    goto :goto_5

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 23
    :cond_9
    :goto_5
    sget-wide v7, Lcom/mob/tools/a/c$a;->c:J

    invoke-static {v4, v7, v8}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v7, :cond_a

    .line 24
    monitor-exit v3

    return v6

    .line 25
    :cond_a
    :try_start_5
    const-class v7, Lcom/mob/tools/a/c$b$g;

    invoke-virtual {v7}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v7

    .line 26
    array-length v8, v7

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v8, :cond_c

    aget-object v10, v7, v9

    .line 27
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v11

    if-ne v11, v2, :cond_b

    .line 28
    invoke-static {v10}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    sput-wide v7, Lcom/mob/tools/a/c$a;->d:J

    goto :goto_7

    :cond_b
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    .line 29
    :cond_c
    :goto_7
    sget-wide v7, Lcom/mob/tools/a/c$a;->d:J

    invoke-static {v4, v7, v8}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v7, :cond_d

    .line 30
    monitor-exit v3

    return v6

    .line 31
    :cond_d
    :try_start_6
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 32
    array-length v7, v2

    const/4 v8, 0x0

    const/4 v9, 0x1

    :goto_8
    const/4 v10, 0x2

    if-ge v8, v7, :cond_11

    aget-object v11, v2, v8

    .line 33
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v12

    sget-object v13, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v12, v13, :cond_10

    if-ne v9, v5, :cond_e

    .line 34
    invoke-static {v11}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v10

    sput-wide v10, Lcom/mob/tools/a/c$a;->f:J

    :goto_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_e
    if-ne v9, v10, :cond_f

    .line 35
    invoke-static {v11}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v10

    sput-wide v10, Lcom/mob/tools/a/c$a;->e:J

    goto :goto_9

    :cond_f
    const/4 v12, 0x3

    if-ne v9, v12, :cond_10

    .line 36
    invoke-static {v11}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    sput-wide v7, Lcom/mob/tools/a/c$a;->g:J

    goto :goto_b

    :cond_10
    :goto_a
    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    .line 37
    :cond_11
    :goto_b
    sget-wide v7, Lcom/mob/tools/a/c$a;->f:J

    invoke-static {v4, v7, v8}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v2, :cond_12

    .line 38
    monitor-exit v3

    return v6

    .line 39
    :cond_12
    :try_start_7
    sget-wide v7, Lcom/mob/tools/a/c$a;->e:J

    invoke-static {v4, v7, v8}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v2, :cond_13

    .line 40
    monitor-exit v3

    return v6

    .line 41
    :cond_13
    :try_start_8
    sget-wide v7, Lcom/mob/tools/a/c$a;->g:J

    invoke-static {v4, v7, v8}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz v2, :cond_14

    .line 42
    monitor-exit v3

    return v6

    .line 43
    :cond_14
    :try_start_9
    const-class v2, Lcom/mob/tools/a/c$b$d;

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    .line 44
    array-length v7, v2

    const/4 v8, 0x0

    :goto_c
    if-ge v8, v7, :cond_16

    aget-object v9, v2, v8

    .line 45
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v11

    const-class v12, Ljava/lang/reflect/Member;

    if-ne v11, v12, :cond_15

    .line 46
    invoke-static {v9}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    sput-wide v7, Lcom/mob/tools/a/c$a;->h:J

    goto :goto_d

    :cond_15
    add-int/lit8 v8, v8, 0x1

    goto :goto_c

    .line 47
    :cond_16
    :goto_d
    sget-wide v7, Lcom/mob/tools/a/c$a;->h:J

    invoke-static {v4, v7, v8}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-eqz v2, :cond_17

    .line 48
    monitor-exit v3

    return v6

    .line 49
    :cond_17
    :try_start_a
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v2

    .line 50
    array-length v7, v2

    const/4 v11, 0x0

    const/4 v12, 0x1

    const-wide/16 v13, 0x0

    :goto_e
    if-ge v11, v7, :cond_1a

    aget-object v15, v2, v11

    .line 51
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v8

    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_19

    if-ne v12, v5, :cond_18

    .line 52
    invoke-virtual {v15, v5}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 53
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v8

    invoke-virtual {v8, v15}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflect(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    move-result-object v8

    .line 54
    sget-wide v13, Lcom/mob/tools/a/c$a;->c:J

    invoke-static {v8, v13, v14}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;J)J

    move-result-wide v13

    add-int/lit8 v12, v12, 0x1

    goto :goto_f

    :cond_18
    if-ne v12, v10, :cond_19

    .line 55
    invoke-virtual {v15, v5}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 56
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflect(Ljava/lang/reflect/Method;)Ljava/lang/invoke/MethodHandle;

    move-result-object v2

    .line 57
    sget-wide v7, Lcom/mob/tools/a/c$a;->c:J

    invoke-static {v2, v7, v8}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;J)J

    move-result-wide v8

    goto :goto_10

    :cond_19
    :goto_f
    add-int/lit8 v11, v11, 0x1

    goto :goto_e

    :cond_1a
    const-wide/16 v8, 0x0

    :goto_10
    sub-long/2addr v8, v13

    .line 58
    sput-wide v8, Lcom/mob/tools/a/c$a;->i:J

    .line 59
    invoke-static {v4, v8, v9}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-eqz v2, :cond_1b

    .line 60
    monitor-exit v3

    return v6

    .line 61
    :cond_1b
    :try_start_b
    sget-wide v7, Lcom/mob/tools/a/c$a;->e:J

    invoke-static {v1, v7, v8}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;J)J

    move-result-wide v1

    sub-long/2addr v13, v1

    .line 62
    sget-wide v1, Lcom/mob/tools/a/c$a;->i:J

    sub-long/2addr v13, v1

    sput-wide v13, Lcom/mob/tools/a/c$a;->j:J

    .line 63
    invoke-static {v4, v13, v14}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-eqz v1, :cond_1c

    .line 64
    monitor-exit v3

    return v6

    .line 65
    :cond_1c
    :try_start_c
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    .line 66
    array-length v2, v1

    const/4 v7, 0x0

    move-object v11, v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    :goto_11
    if-ge v8, v2, :cond_1f

    aget-object v12, v1, v8

    .line 67
    invoke-virtual {v12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v13

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v13, v14, :cond_1e

    if-ne v9, v5, :cond_1d

    .line 68
    invoke-virtual {v12, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 69
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v11

    invoke-virtual {v11, v12}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectGetter(Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;

    move-result-object v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_12

    :cond_1d
    if-ne v9, v10, :cond_1e

    .line 70
    invoke-virtual {v12, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 71
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectGetter(Ljava/lang/reflect/Field;)Ljava/lang/invoke/MethodHandle;

    move-result-object v7

    goto :goto_13

    :cond_1e
    :goto_12
    add-int/lit8 v8, v8, 0x1

    goto :goto_11

    .line 72
    :cond_1f
    :goto_13
    sget-wide v1, Lcom/mob/tools/a/c$a;->c:J

    invoke-static {v11, v1, v2}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;J)J

    move-result-wide v1

    .line 73
    sget-wide v8, Lcom/mob/tools/a/c$a;->c:J

    invoke-static {v7, v8, v9}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;J)J

    move-result-wide v7

    sub-long/2addr v7, v1

    .line 74
    sput-wide v7, Lcom/mob/tools/a/c$a;->k:J

    .line 75
    invoke-static {v4, v7, v8}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v7
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    if-eqz v7, :cond_20

    .line 76
    monitor-exit v3

    return v6

    .line 77
    :cond_20
    :try_start_d
    sget-wide v7, Lcom/mob/tools/a/c$a;->f:J

    invoke-static {v0, v7, v8}, Lcom/mob/tools/a/c$c;->a(Ljava/lang/Object;J)J

    move-result-wide v7

    sub-long/2addr v1, v7

    .line 78
    sput-wide v1, Lcom/mob/tools/a/c$a;->l:J

    .line 79
    invoke-static {v4, v1, v2}, Lcom/mob/tools/a/c$a;->a(Ljava/lang/String;J)Z

    move-result v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    if-eqz v0, :cond_21

    .line 80
    monitor-exit v3

    return v6

    .line 81
    :cond_21
    :try_start_e
    invoke-static {}, Lcom/mob/tools/a/c;->a()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 82
    :catchall_0
    :try_start_f
    invoke-static {}, Lcom/mob/tools/a/c$a;->c()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto :goto_15

    .line 83
    :cond_22
    :goto_14
    monitor-exit v3

    return v6

    .line 84
    :cond_23
    :goto_15
    :try_start_10
    sput-boolean v5, Lcom/mob/tools/a/c$a;->m:Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 85
    monitor-exit v3

    return v5

    :catchall_1
    move-exception v0

    monitor-exit v3

    goto :goto_17

    :goto_16
    throw v0

    :goto_17
    goto :goto_16
.end method

.method private static a(Ljava/lang/String;J)Z
    .locals 4

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    const/4 v1, 0x1

    .line 162
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "|"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 163
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p1, v1

    invoke-virtual {p0, v0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 164
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "3xu ckZr "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return v1

    :cond_0
    return v0
.end method

.method private static a([Ljava/lang/Class;[Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    .line 165
    array-length v1, p0

    if-nez v1, :cond_1

    :cond_0
    if-eqz p1, :cond_c

    array-length v1, p1

    if-nez v1, :cond_1

    goto/16 :goto_1

    .line 166
    :cond_1
    array-length v1, p0

    array-length v2, p1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    :cond_2
    const/4 v1, 0x0

    .line 167
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_c

    .line 168
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-eqz v2, :cond_a

    .line 169
    aget-object v2, p0, v1

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v2, v4, :cond_3

    aget-object v2, p1, v1

    instance-of v2, v2, Ljava/lang/Integer;

    if-nez v2, :cond_3

    return v3

    .line 170
    :cond_3
    aget-object v2, p0, v1

    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v2, v4, :cond_4

    aget-object v2, p1, v1

    instance-of v2, v2, Ljava/lang/Byte;

    if-nez v2, :cond_4

    return v3

    .line 171
    :cond_4
    aget-object v2, p0, v1

    sget-object v4, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v2, v4, :cond_5

    aget-object v2, p1, v1

    instance-of v2, v2, Ljava/lang/Character;

    if-nez v2, :cond_5

    return v3

    .line 172
    :cond_5
    aget-object v2, p0, v1

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v2, v4, :cond_6

    aget-object v2, p1, v1

    instance-of v2, v2, Ljava/lang/Boolean;

    if-nez v2, :cond_6

    return v3

    .line 173
    :cond_6
    aget-object v2, p0, v1

    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v2, v4, :cond_7

    aget-object v2, p1, v1

    instance-of v2, v2, Ljava/lang/Double;

    if-nez v2, :cond_7

    return v3

    .line 174
    :cond_7
    aget-object v2, p0, v1

    sget-object v4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v2, v4, :cond_8

    aget-object v2, p1, v1

    instance-of v2, v2, Ljava/lang/Float;

    if-nez v2, :cond_8

    return v3

    .line 175
    :cond_8
    aget-object v2, p0, v1

    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v2, v4, :cond_9

    aget-object v2, p1, v1

    instance-of v2, v2, Ljava/lang/Long;

    if-nez v2, :cond_9

    return v3

    .line 176
    :cond_9
    aget-object v2, p0, v1

    sget-object v4, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v2, v4, :cond_b

    aget-object v2, p1, v1

    instance-of v2, v2, Ljava/lang/Short;

    if-nez v2, :cond_b

    return v3

    .line 177
    :cond_a
    aget-object v2, p1, v1

    if-eqz v2, :cond_b

    aget-object v2, p0, v1

    aget-object v4, p1, v1

    invoke-virtual {v2, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    return v3

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_c
    :goto_1
    return v0
.end method

.method private static declared-synchronized b()Z
    .locals 4

    const-class v0, Lcom/mob/tools/a/c$a;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/mob/commons/ab;->a()Lcom/mob/commons/ab;

    move-result-object v1

    const-string v2, "usf"

    const/4 v3, -0x1

    invoke-virtual {v1, v2, v3}, Lcom/mob/commons/ab;->b(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const-string v1, "3xu ckFe f"

    .line 2
    invoke-static {v1}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    .line 3
    monitor-exit v0

    return v1

    :cond_0
    if-ne v1, v3, :cond_1

    .line 4
    :try_start_1
    invoke-static {v2}, Lcom/mob/tools/a/c$a;->a(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5
    monitor-exit v0

    return v2

    .line 6
    :cond_1
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static declared-synchronized c()V
    .locals 2

    const-class v0, Lcom/mob/tools/a/c$a;

    monitor-enter v0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-static {v1}, Lcom/mob/tools/a/c$a;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private static d()Z
    .locals 10

    const-string v0, "|m"

    const-string v1, "|f"

    const/4 v2, 0x0

    :try_start_0
    const-string v3, ""

    .line 1
    const-class v4, Lcom/mob/tools/a/c$b$f;

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    array-length v4, v4

    .line 2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "f"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v5, 0x5

    const-string v6, "3xu ckHpCz "

    if-eq v4, v5, :cond_0

    .line 3
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V

    return v2

    .line 4
    :cond_0
    const-class v4, Lcom/mob/tools/a/c$b$g;

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    array-length v4, v4

    .line 5
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x1

    if-eq v4, v7, :cond_1

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V

    return v2

    .line 7
    :cond_1
    const-class v4, Lcom/mob/tools/a/c$b$d;

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    array-length v4, v4

    .line 8
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x2

    if-eq v4, v8, :cond_2

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V

    return v2

    .line 10
    :cond_2
    const-class v4, Lcom/mob/tools/a/c$b$b;

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    array-length v4, v4

    .line 11
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v9, 0x1a

    if-eq v4, v9, :cond_3

    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V

    return v2

    .line 13
    :cond_3
    const-class v4, Lcom/mob/tools/a/c$b$a;

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    array-length v4, v4

    .line 14
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    if-eq v4, v7, :cond_4

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V

    return v2

    .line 16
    :cond_4
    const-class v4, Lcom/mob/tools/a/c$b$c;

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    array-length v4, v4

    .line 17
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    if-eq v4, v5, :cond_5

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V

    return v2

    .line 19
    :cond_5
    const-class v4, Lcom/mob/tools/a/c$b$h;

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    array-length v4, v4

    .line 20
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x4

    if-eq v4, v3, :cond_6

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V

    return v2

    .line 22
    :cond_6
    const-class v3, Lcom/mob/tools/a/c$b$i;

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    array-length v3, v3

    .line 23
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-ge v3, v8, :cond_7

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V

    return v2

    .line 25
    :cond_7
    const-class v3, Lcom/mob/tools/a/c$b$e;

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v3

    array-length v3, v3

    .line 26
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-ge v3, v7, :cond_8

    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mob/tools/a/d;->b(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return v2

    :cond_8
    return v7

    :catchall_0
    move-exception v0

    .line 28
    invoke-static {v0}, Lcom/mob/tools/a/d;->a(Ljava/lang/Throwable;)V

    return v2
.end method
